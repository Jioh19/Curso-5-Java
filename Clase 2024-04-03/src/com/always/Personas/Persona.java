package com.always.Personas;

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
	
	
}
