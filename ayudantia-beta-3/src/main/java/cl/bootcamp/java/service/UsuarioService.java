package cl.bootcamp.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bootcamp.java.model.Usuario;
import cl.bootcamp.java.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository repository;
	
	public List<Usuario> leer() {
		return repository.findAll();
	}
 	
	public Usuario buscarNombre(String nombre) {
		return repository.findByNombre(nombre);
	}

	public void agregar(Usuario usuario) {
		repository.save(usuario);
	}

}
