package com.always.Personas;

import java.util.Objects;

public class Persona {

	private String nombre;
	private int edad;
	private String frase;
	
	
	
	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, String frase) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.frase = frase;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", frase=" + frase + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, frase, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(frase, other.frase) && Objects.equals(nombre, other.nombre);
	}


	
	
}
