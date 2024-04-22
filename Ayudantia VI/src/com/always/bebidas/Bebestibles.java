package com.always.bebidas;

public class Bebestibles {

	public static void main(String[] args) {
		Bebida cristal = BebidaFactory.construir(5, "Cerveza Cristal!");
		System.out.println(cristal.getImpuesto());
		cristal.beber();
		
		Bebida inkaCola = BebidaFactory.construir(0, "Inka Cola");
		System.out.println(inkaCola.getImpuesto());
		inkaCola.beber();
		
		Bebida chivas = BebidaFactory.construir(40, "Chivas Regal Royal Salute");
		System.out.println(chivas.getImpuesto());
		chivas.beber();
		
		Bebida becker = BebidaFactory.construir("Bebida alcoholica", "Cerveza Becker");
		System.out.println(becker.getImpuesto());
		becker.beber();
	}

}
