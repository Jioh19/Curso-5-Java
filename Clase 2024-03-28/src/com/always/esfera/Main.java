package com.always.esfera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el valor del radio");
		
		Double radio = scanner.nextDouble();
		
		Double volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);
		
		System.out.println("El volumen de la esfera es de: " + Math.round(volumen));
		
	}

}
