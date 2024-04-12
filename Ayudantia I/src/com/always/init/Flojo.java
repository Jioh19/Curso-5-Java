package com.always.init;

import java.util.Scanner;

public class Flojo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingresa tu edad");
//		int edad = sc.nextInt();
//		//BufferedReader br = new 
//
//		if(edad < 18) {
//			System.out.println("Eres menor edad, Largo!!!");
//		} else if(edad > 70) {
//			System.out.println("Eres muy mayor, por favor retirese");
//		} else {
//			System.out.println("Estas en el rango etario correcto, bienvenido!");
//		}
		
		boolean continuar = true;
		

		for(; continuar ;) {
		//while(continuar) {
			System.out.println("Ingresa el dia");
			int dia = sc.nextInt();
			
			switch(dia) {
			case 1: 
				System.out.println("El dia es lunes");
				break;
			case 2:
				System.out.println("El dia es martes");
				break;
			case 3:
				System.out.println("El dia es miercoles");
				break;
			case 4:
				System.out.println("El dia es juevevs");
				break;
			case 5: 
				System.out.println("El dia es viernes");
				break;
			case 6: 
				System.out.println("El dia es sabado");
				break;
			case 7:
				System.out.println("El dia es domingo");
				break;
			case 9:
				continuar = false;
				break;
			default:
				System.out.println("El dia es invalido");
				break;
			}
		}
	}

}
