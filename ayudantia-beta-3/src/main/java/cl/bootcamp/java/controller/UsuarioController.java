package cl.bootcamp.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.bootcamp.java.model.Usuario;
import cl.bootcamp.java.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@GetMapping("/")
	public String home(Model model) {
		//System.out.println(service.leer());
		System.out.println(service.buscarNombre("Natalia"));
		List<Usuario> usuarios = service.leer();
		model.addAttribute("usuarios", usuarios);
		return "lista-usuarios";
	}
	
	@GetMapping("/usuarios")
	public String getUsuarios(Model model) {
		List<Usuario> usuarios = service.leer();
		model.addAttribute("usuarios", usuarios);
		return "lista-usuarios";
	}
	

}
