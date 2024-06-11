package cl.bootcamp.java.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.bootcamp.java.model.Usuario;
import cl.bootcamp.java.service.UsuarioService;

@Controller
public class UsuarioController {
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired 
	private UsuarioService service;
	
	@GetMapping("/registro")
	public String registro() {
		return "registro";
	}
	
	@PostMapping("/crearUsuario")
	public String crear(@ModelAttribute("usuario") Usuario usuario) {
		
		log.info("Entrando al método UsuarioController.crear()");
		String pagina = "error";
		int resultado = 0;
		
		try {
			
			resultado = service.guardarUsuario(usuario);
			
			if(resultado == 1) {
				service.asignarRoles(usuario.getRoles(), usuario.getUsername());
				pagina = "resultado";
			}
		
		} catch (Exception ex) {
			log.error("Error en insertar datos : ", ex.getMessage());
		}
		
		log.info("Saliendo al método UsuarioController.crear()");
		return pagina;
	}
	
}
