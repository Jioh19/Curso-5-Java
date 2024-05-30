package com.alke.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.alke.wallet.model.Usuario;

@Service
public class UsuarioService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
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
	
	public int guardar(Usuario usuario) {
		String sql = "insert into usuario (nombre_usuario, email, password) value(?,?,?)";
		return jdbcTemplate.update(sql, 
				usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword());
	}
}
