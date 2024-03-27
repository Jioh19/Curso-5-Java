package com.always.ayudantia;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = scanner.nextInt();
        if(edad < 18) {
            System.out.println("Eres menor de edad, Chao!!!!");
        } else {
            System.out.println("Bienvenido seas!!!");
        }
        scanner.close();
	}

}
