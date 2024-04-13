package com.always.init;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		//Sumatoria de 10: 1 +2 +3 +4+ 5+ +... +10
		//"" = 10*11/2
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el valor de la sumatoria");
		int num = sc.nextInt();		
		int total = 0;
		for(int i = 1; i <= num; i++) {
			total += i;
		}
		
		System.out.printf("El total de la sumatoria hasta %d es de %d", num, total);
	}

}
