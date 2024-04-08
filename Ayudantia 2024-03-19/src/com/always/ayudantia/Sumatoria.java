package com.always.ayudantia;

import java.util.Scanner;

public class Sumatoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero");
        int num = scanner.nextInt();
        int sumatoria = 0;
        int indice = 0;
        while(indice <= num) {
            sumatoria = sumatoria + indice;
            indice = indice + 1;
        }
        System.out.println("El valor de la sumatoria es " + sumatoria);
        scanner.close();
	}

}
