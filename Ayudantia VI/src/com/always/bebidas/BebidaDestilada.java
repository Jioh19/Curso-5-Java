package com.always.bebidas;

public class BebidaDestilada extends Bebida{

	
	
	public BebidaDestilada(String nombre) {
		super();
		this.tipo = "Bebida destilada";
		this.nombre = nombre;
	}

	@Override
	public void beber() {
		System.out.println("Estoy bebiendo mi destilado " + nombre);
		
	}

	@Override
	public double getImpuesto() {
		return 30;
	}
	
}
