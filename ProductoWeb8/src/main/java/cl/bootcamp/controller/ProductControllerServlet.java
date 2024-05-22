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
 * Servlet implementation class ProductControllerServlet
 */
@WebServlet("/ProductControllerServlet")
public class ProductControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Producto> listaProd = new ArrayList<>();
		ProductoService service = new ProductoService();

		try {
			listaProd = service.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		HttpSession session = request.getSession();
		session.setAttribute("listaProd", listaProd);

		response.sendRedirect("listaProductos.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Creacion de objetos del metodo
		Producto producto = new Producto();
		ProductoService service = new ProductoService();

		// Seteo el objeto producto con los valores del formulario
		producto.setNombre(request.getParameter("nombre"));
		producto.setPrecio(request.getParameter("precio"));

		int resultado = 0;
		try {
			resultado = service.create(producto);
			System.out.println(resultado);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (0 < resultado) {
			response.sendRedirect("exito.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}
}
