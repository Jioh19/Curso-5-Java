package com.always.superLiga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa los partidos ganados");
		int partidosGanados = scanner.nextInt();
		System.out.println("Ingresa los partidos empatados");
		int partidosEmpatados = scanner.nextInt();
		System.out.println("Ingresa los partidos perdidos");
		int partidosPerdidos = scanner.nextInt();
		int ppg = partidosGanados * 3;
		int ppe = partidosEmpatados;
		int ptotal = ppg+ppe;
		System.out.printf("Total partidos Ganados: \t%d\n", partidosGanados);
		System.out.printf("Total partidos Empatados: \t%d\n", partidosEmpatados);
		System.out.printf("Total partidos Perdidos: \t%d\n", partidosPerdidos);
		System.out.printf("PPG: %d  \tPPE: %d  \tPuntaje Total: %d", ppg, ppe, ptotal);
		scanner.close();
	}
}
