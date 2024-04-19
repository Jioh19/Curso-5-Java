package com.always.advent3;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class advent3 {

	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("input3.txt");
		Scanner sc = new Scanner(file);
		String input = sc.nextLine();
		System.out.println(input);
		
		Map<Point, Integer> coordenadas = new HashMap<>();
		
 		
		int acum = 0;
		int i = 0;
		int j = 0;
		Point inicio = new Point(i, j);
		coordenadas.put(inicio, 1);
		for(int pos = 0; pos < input.length(); pos++) {
			switch(input.charAt(pos)) {
			case '^':
				i--;
				break;
			case '>':
				j++;
				break;
			case'v':
				i++;
				break;
			case '<':
				j--;
				break;			
			}
			Point point = new Point(i, j);
			coordenadas.put(point, coordenadas.getOrDefault(point, 0) +1);
		}
		System.out.println(coordenadas.size());
	}

}
