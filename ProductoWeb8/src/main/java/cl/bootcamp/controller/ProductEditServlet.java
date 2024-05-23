package cl.bootcamp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.bootcamp.model.Producto;
import cl.bootcamp.service.ProductoService;

/**
 * Servlet implementation class ProductEditServlet
 */
@WebServlet("/ProductEditServlet")
public class ProductEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductEditServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("nombre", nombre);
		session.setAttribute("precio", precio);

		response.sendRedirect("editar.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Producto producto = new Producto();
		ProductoService service = new ProductoService();

		producto.setId(Integer.valueOf(request.getParameter("id")));
		producto.setNombre(request.getParameter("nombre"));
		producto.setPrecio(request.getParameter("precio"));

		int resultado = 0;
		try {
			resultado = service.update(producto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (resultado > 0) {
			response.sendRedirect(request.getContextPath() + "/ProductControllerServlet");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

}
