package cl.bootcamp.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	
	@GetMapping("/paginaLogin")
	public String login() {
		return "login";
	}
	
	@GetMapping("/accesoDenegado")
	public String accesoDenegado() {
		return "acceso-denegado";
	}

}
