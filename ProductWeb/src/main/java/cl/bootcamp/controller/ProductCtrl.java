package cl.bootcamp.controller;

import java.io.IOException;

import cl.bootcamp.model.Producto;
import cl.bootcamp.service.ProductoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductCtrl
 */
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Creacion de objetos del metodo
		Producto producto = new Producto();
		ProductoService service = new ProductoService();
		
		//Seteo el objeto producto con los valores del formulario
		producto.setNombre(request.getParameter("nombre"));
		producto.setPrecio(request.getParameter("precio"));
				
		int resultado = service.insertarProducto(producto);
		if(0 < resultado) {
			response.sendRedirect("exito.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
		
		
	}

}
