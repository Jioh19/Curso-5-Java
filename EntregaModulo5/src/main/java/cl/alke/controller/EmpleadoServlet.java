package cl.alke.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.alke.dao.EmpleadoDao;
import cl.alke.model.Empleado;
import cl.alke.service.EmpleadoService;

/**
 * Servlet implementation class EmpleadoServlet
 */
@WebServlet("/Empleado")
public class EmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private EmpleadoService service = new EmpleadoService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Empleado> empleados = service.readAll();
		
		HttpSession session = request.getSession();
		session.setAttribute("empleados", empleados);
		
		response.sendRedirect("listaEmpleados.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String, String> errores = new HashMap<>();
		EmpleadoDao service = new EmpleadoDao();
		String nombre = request.getParameter("nombre");
		String primerApellido = request.getParameter("primerApellido");
		String segundoApellido = request.getParameter("segundoApellido");
		String email = request.getParameter("email");
		String salario = request.getParameter("salario");
		
		if(nombre == null || nombre.trim().isEmpty()) {
			errores.put("nombre", "debe de ingresar un nombre válido");
		}
		if(primerApellido == null || primerApellido.trim().isEmpty()) {
			errores.put("primerApellido", "debe de ingresar un apellido válido");
		}
		
		if(segundoApellido == null || segundoApellido.trim().isEmpty()) {
			errores.put("segundoApellido", "debe de ingresar un apellido válido");
		}
		
		if(salario == null || salario.trim().isEmpty()) {
			errores.put("salario", "debe de ingresar un salario válido");
		}
		if(email == null || email.trim().isEmpty()) {
			errores.put("email", "debe de ingresar un email válido");
		}
		
		if(errores.isEmpty()) {
			Empleado e = new Empleado(nombre, primerApellido, segundoApellido, email, Double.valueOf(salario));
			try {
				service.crear(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			response.sendRedirect("exito.jsp");
		} else {
			request.setAttribute("errores", errores);
			request.getRequestDispatcher("/crear.jsp").forward(request, response);
		}
		
	}

}
