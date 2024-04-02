package com.always.buenas;

import java.util.Scanner;

public class EjemploBuenasPracticas {

	public static void main(String[] args) {
		String nombreUsuario;
		int edadUsuario;
		
		Scanner escaneador = new Scanner(System.in);
		
		nombreUsuario = escaneador.next();
		edadUsuario = escaneador.nextInt();
		
		System.out.println("El nombre del usuario es " + nombreUsuario);
		System.out.println("la edad del usuario es " + edadUsuario);
	}

}
