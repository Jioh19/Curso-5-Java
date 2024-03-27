package com.always.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean onLoop = true;
		Scanner scanner = new Scanner(System.in);
		while(onLoop) {
			System.out.println("***Seleccione operacion***");
			System.out.println("\t+ para sumar");
			System.out.println("\t- para restar");
			System.out.println("\t* para multiplicar");
			System.out.println("\t/ para dividir");
			System.out.println("\tq para salir");
			char commando = scanner.next().charAt(0);
			switch(commando) {
			case '+':{
				System.out.println("Ingresa el primer número");
				Double num1 = scanner.nextDouble();
				System.out.println("Ingresa el segundo número");
				Double num2 = scanner.nextDouble();
				Double resultado = num1 + num2;
				System.out.println("El resultado de la suma es " + resultado);
				break;
			}
			case '-': {
				System.out.println("Ingresa el primer número");
				Double num1 = scanner.nextDouble();
				System.out.println("Ingresa el segundo número");
				Double num2 = scanner.nextDouble();
				Double resultado = num1 - num2;
				System.out.println("El resultado de la resta es " + resultado);
				break;
			}
			case '*': {
				System.out.println("Ingresa el primer número");
				Double num1 = scanner.nextDouble();
				System.out.println("Ingresa el segundo número");
				Double num2 = scanner.nextDouble();
				Double resultado = num1 * num2;
				System.out.println("El resultado de la multiplicación es " + resultado);
				break;
			}
			case '/': {
				System.out.println("Ingresa el primer número");
				Double num1 = scanner.nextDouble();
				System.out.println("Ingresa el segundo número");
				Double num2 = scanner.nextDouble();
				Double resultado = num1 / num2;
				System.out.println("El resultado de la división es " + resultado);
				break;
			}
			case 'q':
				onLoop = false;
				break;
			default:
				System.out.println("Commando inválido");
					
			}

		}
		System.out.println("Saliste de la calculadora");
		scanner.close();
	}
	

}
