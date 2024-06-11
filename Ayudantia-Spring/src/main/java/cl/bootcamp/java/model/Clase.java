package cl.bootcamp.java.model;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Clase {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String nombre;
//	@OneToOne
//	private Usuario profesor;
	@OneToMany(mappedBy = "clase")
	Set<NotaCurso> notas;
}
