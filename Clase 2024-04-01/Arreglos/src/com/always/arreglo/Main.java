package com.always.arreglo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precios[] = new int[10];
		// n=0 , n=1, ..., n=4

		int cantidad[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		lector(precios, scanner);
		//lector(cantidad, scanner);
 		bubbleSort(precios);
	
		scanner.close();
		
 		int total = 0;
 		/*for(int i = 0; i< 3; i++) {
 			total += precios[i] * cantidad[i];
 		}*/
 		System.out.println(Arrays.toString(precios));
 		//System.out.println(Arrays.toString(cantidad));
 		//System.out.println("El total es " + total);
	}
	
	static void lector(int arreglo[], Scanner scanner) {
 		
		for(int i = 0; i< arreglo.length; i++) {
 			System.out.println("Ingresa el " + i);
 			arreglo[i] = scanner.nextInt();
 		}
	}
	
	static void bubbleSort(int arreglo[]) {
		for(int j = 0; j < arreglo.length -1; j++) {
			for(int i = 0; i < arreglo.length -1 -j; i++) {
				if(arreglo[i] > arreglo[i+1]) {
					int aux = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = aux;
				}
			}
		}
	}

}
