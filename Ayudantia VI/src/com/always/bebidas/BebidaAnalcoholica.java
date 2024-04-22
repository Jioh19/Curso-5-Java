package com.always.bebidas;

public class BebidaAnalcoholica extends Bebida{

	public BebidaAnalcoholica(String nombre) {
		super();
		this.tipo = "Bebida analcoholica";
		this.nombre = nombre;
	}

	@Override
	public void beber() {
		System.out.println("Bebiendo mi bebida de fantasía " + nombre);
	}

	@Override
	public double getImpuesto() {
		return 10.5;
	}
	
}
