package cl.bootcamp.java.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String nombre;
	private String password;
	private String rut;
	
	
	public Usuario(String nombre, String password, String rut) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.rut = rut;
	}
	
	
}
