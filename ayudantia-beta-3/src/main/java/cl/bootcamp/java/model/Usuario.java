package cl.bootcamp.java.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID) //AI IDENTITY
	private UUID id;
	private String nombre;
	private String password;
	private String rut;
	
	
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String password, String rut) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.rut = rut;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	@Override
	public String toString() {
		return "\n[id=" + id + ", nombre=" + nombre + ", password=" + password + ", rut=" + rut + "]";
	}
	
	

}
