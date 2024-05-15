package cl.bootcamp.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesServlet
 */
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean nuevoUsuario = true;
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			for(Cookie co: cookies) {
				if(co.getName().equals("visitanteRecurrente") && co.getValue().equals("si")) {
					nuevoUsuario = false;
					break;
				}
			}
		}
		
		String mensaje = "";
		if(nuevoUsuario) {
			Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
			response.addCookie(visitanteCookie);
			mensaje = "Visitando el sitio por primera vez";
		} else {
			mensaje = "Visitando nuevamente el sitio";
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("Mensaje: " + mensaje);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
