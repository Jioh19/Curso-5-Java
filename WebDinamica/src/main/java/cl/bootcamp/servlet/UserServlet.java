package cl.bootcamp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recuparemos la informacion del contexto
		ServletContext context = getServletContext();
		String nombreUsuarioCtx = (String) context.getAttribute("usuarioCtx");
		response.setContentType("text/html");
		
		response.getWriter().append("Recuperamos: " + nombreUsuarioCtx).append(request.getContextPath());
		
		// Recuperando informacion de la sesion
		HttpSession session = request.getSession();
		String apellidoSesion = (String) session.getAttribute("usuarioSession");
		
		response.getWriter().append("Recuperamos: " + apellidoSesion).append(request.getContextPath());
		
		//
		
		String edad = (String) request.getAttribute("usuarioSolicitud");
		response.getWriter().append("Recuperamos: " + edad).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
