package cl.bootcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Paramentro
 */
@WebServlet("/Parametro")
public class Paramentro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Paramentro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");
		String html = """
				<!DOCTYPE html>
				<html>
				<head>
				<meta charset="UTF-8">
				<link rel="stylesheet" href="./css/styles.css">
				<title>Mi primer servlet</title>
				</head>
				<body>
				    <h1>Mi primer servlet</h1>"""
				+ "<h4>Nombre: " + nombre + "</h4>" 
				+ "<h4>Precio: " + precio + "</h4>" + """
				    </body>
				</html>
								""";

		out.println(html);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
