package com.always.ayudantia;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la primera nota");
        Double nota1 = scanner.nextDouble();
        System.out.println("Dame la segunda nota");
        Double nota2 = scanner.nextDouble();
        System.out.println("Dame la tercera nota");
        Double nota3 = scanner.nextDouble();
        Double notaPromedio = (nota1+nota2+nota3)/3;
        System.out.println("La nota promedio es " + notaPromedio);
        scanner.close();
	}

}
