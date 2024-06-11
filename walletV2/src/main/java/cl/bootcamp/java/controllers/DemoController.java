package cl.bootcamp.java.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@PreAuthorize("hasAnyRole('Empleado', 'Jefe')")
	@GetMapping("/empleados")
	public String empleados() {
		return "empleados";
	}
	
	@PreAuthorize("hasRole('Jefe')")
	@GetMapping("/jefes")
	public String jefes() {
		return "jefes";
	}
	
	@PreAuthorize("hasRole('Jefe')")
	@GetMapping("/instrucciones")
	public String instrucciones() {
		return "instrucciones";
	}

}
