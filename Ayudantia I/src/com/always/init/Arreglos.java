package com.always.init;

import java.util.Arrays;
import java.util.Random;

public class Arreglos {

	public static void main(String[] args) {
		double inicio = System.currentTimeMillis();
		int arreglo[] = new int[10000];

		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = new Random().nextInt(10000);
		}
		
		System.out.println(Arrays.toString(arreglo));
		
		for(int j = 0; j < arreglo.length-1; j++) {
			for(int i = 0; i < arreglo.length-1-j; i++) {
				if(arreglo[i] > arreglo[i+1]) {
					int aux = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(arreglo));
		double termino = System.currentTimeMillis();
		System.out.println("El programa se ejecuto en " + (termino - inicio));
	}

}
