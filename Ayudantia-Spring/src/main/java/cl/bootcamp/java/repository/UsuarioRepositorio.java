package cl.bootcamp.java.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.bootcamp.java.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, UUID>{

	List<Usuario> findByNombreIgnoreCase(String nombre);
	List<Usuario> findTop5ByOrderByNombreDesc();
}
