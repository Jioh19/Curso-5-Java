package cl.bootcamp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.bootcamp.model.Producto;
import cl.bootcamp.service.ProductoService;

/**
 * Servlet implementation class ProductCtrl
 */
@WebServlet("/ProductCtrl")
public class ProductCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Producto> listaProd = new ArrayList();
		ProductoService service = new ProductoService();
		
		try {
			listaProd = service.obtenerProductos();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//sesion
		HttpSession session = request.getSession();
		session.setAttribute("listaProd", listaProd);
		
		response.sendRedirect("listarProductos.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//creación de objetos del método
		Producto producto = new Producto();
		ProductoService service = new ProductoService();
		
		//seteo el objeto producto con los valores del formulario
		producto.setNombre(request.getParameter("nombre"));
		producto.setPrecio(request.getParameter("precio"));
		
		int resultado = service.insertarProducto(producto);
		
		if( resultado > 0) {
			response.sendRedirect("exito.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
		
			
	}

}
