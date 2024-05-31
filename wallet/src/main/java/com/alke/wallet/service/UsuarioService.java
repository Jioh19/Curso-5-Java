package com.alke.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.alke.wallet.model.Usuario;
import com.alke.wallet.repository.UsuarioRepositorio;

@Service
public class UsuarioService {
	
	@Autowired 
	private UsuarioRepositorio repositorio;
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
//	
//	public int guardar(Usuario usuario) {
//		String sql = "insert into usuario (nombre, email, pass) value(?,?,?)";
//		return jdbcTemplate.update(sql, 
//				usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword());
//	}
	
	public Usuario guardar(Usuario usuario) {
		Usuario usuarioGuardado = repositorio.save(usuario);
		return usuarioGuardado;
	}
	
	public List<Usuario> obtenerUsuario() {
		List<Usuario> listaUsuario = (List<Usuario>) repositorio.findAll();
		return listaUsuario;
	}
	
	public Usuario obtenerUsuarioPorEmail(String email) {
		Usuario usuario = repositorio.buscarPorEmail(email);
		return usuario;
	}
}
