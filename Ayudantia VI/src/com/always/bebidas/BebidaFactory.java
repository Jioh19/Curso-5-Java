package com.always.bebidas;

public class BebidaFactory {
	private static BebidaFactory instance;
	
	private BebidaFactory() {
		
	}
	
	public static BebidaFactory getInstance() {
		if(instance == null) {
			instance = new BebidaFactory();
		}
		
		return instance;
	}
	
	public static Bebida construir(int alcohol, String nombre) {
		if(alcohol == 0) {
			return new BebidaAnalcoholica(nombre);
		} else if(alcohol < 20) {
			return new BebidaAlcoholica(nombre);
		} else {
			return new BebidaDestilada(nombre);
		}
	}
	
	public static Bebida construir(String tipo, String nombre) {
		switch(tipo) {
		case "Bebida analcoholica":
			return new BebidaAnalcoholica(nombre);
		case "Bebida alcoholica":
			return new BebidaAlcoholica(nombre);
		case "Bebida destilada":
			return new BebidaDestilada(nombre);
		default:
			return null;
		}
	}
}
