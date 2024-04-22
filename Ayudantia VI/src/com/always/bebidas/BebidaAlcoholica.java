package com.always.bebidas;

public class BebidaAlcoholica extends Bebida{

	
	public BebidaAlcoholica(String nombre) {
		super();
		this.tipo = "Bebida alcoholica";
		this.nombre = nombre;
	}

	@Override
	public void beber() {
		System.out.println("Bebiendo mi bebida alcoholica " + nombre);
	}

	@Override
	public double getImpuesto() {
		return 20;
	}

}
