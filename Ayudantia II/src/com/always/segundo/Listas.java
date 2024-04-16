package com.always.segundo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaArreglo = new ArrayList<>();
		LinkedList<Integer> listaLigada = new LinkedList<>();
		
		for(int i = 0; i< 15000; i++) {
			int numero = new Random().nextInt(1000);
			listaArreglo.add(numero);
			listaLigada.add(numero);
		}
		double arregloStart = System.currentTimeMillis();
		listaArreglo.sort((a, b) -> {
			return b - a;
		});
		
	
		double arregloEnd = System.currentTimeMillis();
		System.out.println("La lista de arreglos tiene: " + listaArreglo.toString());
		System.out.println("Se demoro: " + (arregloEnd - arregloStart));

		double ligadaStart = System.currentTimeMillis();
		listaLigada.sort((a, b) -> {
			return b - a;
		});
		double ligadaEnd = System.currentTimeMillis();
		System.out.println("La lista ligada tiene: " + listaLigada.toString());
		System.out.println("Se demoro: " + (ligadaEnd - ligadaStart));
	}

}
