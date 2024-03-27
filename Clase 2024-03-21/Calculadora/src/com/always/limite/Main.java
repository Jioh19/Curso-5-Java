package com.always.limite;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese el limite");
		Scanner lector = new Scanner(System.in);
		int limite = lector.nextInt();
		int suma = 0;
		while(suma < limite) {
			System.out.println("Por favor ingrese el número");
			//suma += lector.nextInt();
			int aux = lector.nextInt();
			suma = suma + aux;
		}
		System.out.printf("La suma %d supero  al  limite %d ", suma, limite);
	}

}
