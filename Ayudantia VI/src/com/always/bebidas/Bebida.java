package com.always.bebidas;

public abstract class Bebida {
	protected String tipo;
	protected String nombre;
	
	public abstract void beber();
	public abstract double getImpuesto();
}
