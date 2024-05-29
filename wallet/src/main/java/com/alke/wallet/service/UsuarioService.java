package com.alke.wallet.service;

import org.springframework.stereotype.Service;

import com.alke.wallet.model.Usuario;

@Service
public class UsuarioService {
	private Usuario usuario;
	
	public UsuarioService() {
		usuario = new Usuario();
	}
	
	public Usuario crear(Usuario user) {
		usuario.setEmail(user.getEmail());
		usuario.setId(1);
		usuario.setNombreUsuario(user.getNombreUsuario());
		usuario.setPassword(user.getPassword());
		return usuario;
	}
}
