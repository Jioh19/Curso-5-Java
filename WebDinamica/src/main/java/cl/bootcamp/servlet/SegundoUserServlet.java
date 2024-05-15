package cl.bootcamp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SegundoUserServlet
 */
public class SegundoUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CORRECT_PASS = "1234";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SegundoUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>formulario</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<FORM METHOD=\"POST\" ACTION=\"#\">");
		out.println("<LABEL FOR=\"NOMBRE\">Indique el nombre</LABEL>");
		out.println("<INPUT NAME=\"nombre\"/>");
		out.println("<br/>");
		out.println("<LABEL FOR=\"Apellido\">Indique el apellido</LABEL>");
		out.println("<INPUT NAME=\"apellido\"/>");
		out.println("<br/>");
		out.println("<LABEL FOR=\"Password\">Indique el password</LABEL>");
		out.println("<INPUT NAME=\"password\"/>");
		out.println("<INPUT TYPE=\"SUBMIT\"/>");
		out.println("</FORM>");
		out.println("</BODY></HTML>");
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String password = request.getParameter("password");
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>formulario</TITLE></HEAD>");
		out.println("<BODY>");
		
		if(password.equals(CORRECT_PASS)) {
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			out.println("<DIV>Bienvenido: " + nombre +" "+ apellido+"</DIV>");
		} else {
			out.println("<DIV>Contraseña incorrecta</DIV>");
		}
			

		out.println("</BODY></HTML>");
	}

}
