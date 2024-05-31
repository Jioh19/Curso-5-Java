package com.alke.wallet.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alke.wallet.model.Usuario;


@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer>{
	
	@Query("SELECT u FROM Usuario u WHERE u.email= ?1")
	public Usuario buscarPorEmail(String email);

}
