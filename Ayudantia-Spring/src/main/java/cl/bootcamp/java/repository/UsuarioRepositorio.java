package cl.bootcamp.java.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import cl.bootcamp.java.model.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, UUID>{

}
