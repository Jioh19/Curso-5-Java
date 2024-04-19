package com.always.exception;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) throws MiExcepcion {
		Scanner sc = new Scanner(System.in);
		
		//try {
			int conti = 1;
			while(conti != 0) {
				System.out.println("Ingresa tus numeros");
				int a = sc.nextInt();
				if(a < 0) {
					throw new MiExcepcion("El numero en a es negativo. Eso esta prohibido");
				}
				int b = sc.nextInt();
				
				int c = a / b;
				
				System.out.println(c);
				System.out.println("Ingresa 0 para salir, 1 para continuar");
				conti = sc.nextInt();
			}
			
	//	} 
//		catch(Exception err) {
//			System.out.println(err.getMessage());
//		}

	}

}
