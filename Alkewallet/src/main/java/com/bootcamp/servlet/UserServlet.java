package com.bootcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
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
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nombre = null;
		out.println("<HTML>");
		out.println("<HEAD><TITLE>formulario</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<FORM METHOD=\"GET\">");
		out.println("<LABEL FOR=\"NOMBRE\">Indique el nombre</LABEL>");
		out.println("<INPUT NAME=\"nombre\"/>");
		out.println("<INPUT TYPE=\"SUBMIT\"/>");
		out.println("</FORM>");
		out.println("</BODY></HTML>");
		
		nombre = request.getParameter("nombre");
		
		if(nombre != null) {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
