package cl.bootcamp.java.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class NotaCurso {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String description;
	private double nota;
	private LocalDate fecha;
	@ManyToOne
	@JoinColumn(name="usuario_id")
	Usuario usuario;
	@ManyToOne
	@JoinColumn(name="clase_id")
	Clase clase;
	
}
