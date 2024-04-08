package Entradas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingresa tu edad");
		Scanner preguntador = new Scanner(System.in);
		int edad = preguntador.nextInt();
		if(edad<4) {
			System.out.println("No se cobra nada!");
		} else if(edad<18) {
			System.out.println("Debe pagar $5");
		} else {
			System.out.println("Debe pagar $10");
		}
	}

}
