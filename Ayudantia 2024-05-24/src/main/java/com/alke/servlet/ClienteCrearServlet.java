package com.alke.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.alke.model.Cliente;
import com.alke.repository.ClienteRepo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClienteCrearServlet
 */
@WebServlet("/CrearCliente")
public class ClienteCrearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteCrearServlet() {
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
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String rut = request.getParameter("rut");
		ClienteRepo clienteRepo = new ClienteRepo();
		Cliente cliente = new Cliente(nombre, apellido, rut);
		Map<String, String> errores = new HashMap<>();
		
		if(nombre == null || nombre.trim().isEmpty()) {
			errores.put("nombre", "debe ingresar un nombre válido");
		}
		if(apellido == null || apellido.trim().isEmpty()) {
			errores.put("apellido", "debe ingresar un apellido válido");
		}
		if(rut== null || rut.trim().isEmpty()) {
			errores.put("rut", "debe ingresar un rut válido");
		}
		
		if(errores.isEmpty()) {
			try {
				clienteRepo.crear(cliente);
				response.sendRedirect("exito.jsp");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			request.setAttribute("errores", errores);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
