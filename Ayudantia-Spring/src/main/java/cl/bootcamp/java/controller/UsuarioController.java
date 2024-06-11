package cl.bootcamp.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cl.bootcamp.java.model.Usuario;
import cl.bootcamp.java.repository.UsuarioRepositorio;
import cl.bootcamp.java.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired 
	UsuarioService service;

	@GetMapping("/")
	public String crear() {
//		Usuario user = new Usuario("Juan", "123456", "987654");
//	
//		service.guardar(user);
//		//repo.save(user);
//		
		List<Usuario> usuarios = service.top5();
		System.out.println(usuarios);
		return "index";
	}
}
