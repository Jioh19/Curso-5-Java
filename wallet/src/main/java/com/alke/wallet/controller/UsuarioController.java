package com.alke.wallet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alke.wallet.model.Usuario;
import com.alke.wallet.service.UsuarioService;

@Controller
public class UsuarioController {
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/")
	public String index() {
		return "login";
	}
	
	@GetMapping(value="/bienvenida", params= {"nombre", "email"}) 
	public String bienvenida(@RequestParam String nombre, 
			@RequestParam String email,
			Model modelo) {
		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("email", email);
		
		return "bienvenida";
	}
	
	@PostMapping("/login")
	public String login (@ModelAttribute("usuario") Usuario usuario, Model model) {
		
		model.addAttribute("nombre", usuario.getNombreUsuario());
		return "bienvenida";
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute("usuario") Usuario usuario, Model model) {
		
		Usuario user = service.crear(usuario);
		model.addAttribute("nombre", usuario.getNombreUsuario());
		model.addAttribute("email", usuario.getEmail());
		return "bienvenida";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("usuario") Usuario usuario, Model model) {
		
		log.info("Entrando al método UsuarioController.guardar");
		log.info("Datos usuario a guardar: " + usuario.getNombreUsuario()); 
		String pagina = "error";
		
		try {
			int usuarioGuardado = service.guardar(usuario);
			if(usuarioGuardado >= 1) {
				model.addAttribute("nombre", usuario.getNombreUsuario());
				model.addAttribute("email", usuario.getEmail());
				pagina = "bienvenida";
			}
		} catch(Exception ex) {
			log.error("Error en insertar datos: " + ex.getMessage());
		}
		
		log.info("Finaliza el método UsuarioController.guardar");
		return "bienvenida";
	}
}