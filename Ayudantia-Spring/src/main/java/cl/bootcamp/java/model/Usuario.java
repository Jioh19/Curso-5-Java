package cl.bootcamp.java.model;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String nombre;
	private String password;
	private String rut;
	@OneToMany(mappedBy = "usuario")
	Set<NotaCurso> notas;

	
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String password, String rut) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.rut = rut;
	}



	@Override
	public String toString() {
		return "\n[id=" + id + ", nombre=" + nombre + ", password=" + password + ", rut=" + rut + ", notas="
				+ notas + "]";
	}
	
	
	
}
