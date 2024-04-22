package com.always.advent3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class advent3 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input3.txt");
		Scanner sc = new Scanner(file);
		String input = sc.nextLine();

		Map<String, Integer> coordenadas = new HashMap<>();

		int i = 0;
		int j = 0;
		String inicio = i + "," + j;
		System.out.println(inicio);
		coordenadas.put(inicio, 1);
		for (int pos = 0; pos < input.length(); pos++) {

			switch (input.charAt(pos)) {
			case '^':
				i--;
				break;
			case '>':
				j++;
				break;
			case 'v':
				i++;
				break;
			case '<':
				j--;
				break;
			}
			String point = i + "," + j;

			coordenadas.put(point, coordenadas.getOrDefault(point, 0) + 1);
		}
		System.out.println(coordenadas.size());

		int i1 = 0;
		int j1 = 0;
		int i2 = 0;
		int j2 = 0;
		coordenadas.clear();
		String str = i1 + "," + j1;
		System.out.println(str);
		coordenadas.put(str, 1);
		for (int pos = 0; pos < input.length(); pos++) {
			
			switch (input.charAt(pos)) {
			case '^':
				if(pos%2 == 0) {
					i1--;
				} else {
					i2--;
				}
				break;
			case '>':
				if(pos%2 == 0) {
					j1++;
				} else {
					j2++;
				}
				break;
			case 'v':
				if(pos%2 == 0) {
					i1++;
				} else {
					i2++;
				}
				break;
			case '<':
				if(pos%2 == 0) {
					j1--;
				} else {
					j2--;
				}
				break;
			}
			String point;
			if(pos%2 == 0) {
				point = i1 + "," + j1;
			} else {
				point = i2 + "," + j2;
			}
			

			coordenadas.put(point, coordenadas.getOrDefault(point, 0) + 1);
		}
		
		System.out.println(coordenadas.size());
		sc.close();
	}
	
	

}
