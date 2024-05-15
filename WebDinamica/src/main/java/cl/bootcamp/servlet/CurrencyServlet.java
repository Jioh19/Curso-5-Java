package cl.bootcamp.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CurrencyServlet
 */
public class CurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrencyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Context
		String nombre = "Juan";
		String apellido = "Oh";
		ServletContext context = getServletContext();
		context.setAttribute("usuarioCtx", nombre);
		
		response.getWriter().append("Ingresando: " + nombre).append(request.getContextPath());
		
		//session
		HttpSession session = request.getSession();
		session.setAttribute("usuarioSession", apellido);
		
		// Solicitud de atributo
		String edad = "42";
		request.setAttribute("usuarioSolicitud", edad);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UserServlet");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
