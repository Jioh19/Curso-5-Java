package cl.bootcamp.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.bootcamp.java.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@Transactional
	public int guardarUsuario(Usuario usuario) {
		String sqlUsers = "insert into users (username, password, enabled) value (?,?,?)";
		String password ="{bcrypt}" + passwordEncoder.encode(usuario.getPassword());
		
		int resultado = jdbcTemplate.update(sqlUsers,
											usuario.getUsername(),
											password,
											usuario.getEnabled());
		return resultado;
	}
	
	@Transactional
	public int asignarRoles(List<String> roles, String username) {
		String sqlAuth = "insert into authorities (username, authority) value(?,?)";
		int resultado = 0;
		
		for(String rol: roles) {
			resultado = jdbcTemplate.update(sqlAuth, username, rol);
		}
		
		return resultado;
	}
}
