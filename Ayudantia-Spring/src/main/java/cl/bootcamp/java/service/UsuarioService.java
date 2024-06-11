package cl.bootcamp.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bootcamp.java.model.Usuario;
import cl.bootcamp.java.repository.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepositorio repo;
	//private UsuarioRepositorio repo = new UsuarioRepositorio();
	
	public Usuario guardar(Usuario usuario) {
		return repo.save(usuario);
	}
	
	public List<Usuario> leer(){ 
		return (List<Usuario>) repo.findAll();
	}
	
	public List<Usuario> top5() {
		return repo.findTop5ByOrderByNombreDesc();
	}
	
}
