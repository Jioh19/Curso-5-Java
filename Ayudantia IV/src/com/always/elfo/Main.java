package com.always.elfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		double inicio = System.currentTimeMillis();
		ArrayList<Integer> calorias = new ArrayList<>();
		
		File fl = new File("input.txt");
		Scanner sc = new Scanner(fl);
		
		int total = 0;
		for(String line; sc.hasNext();) {
			line = sc.nextLine();
			if(line.isEmpty()) {
				calorias.add(total);
				total = 0;
			} else {
				total += Integer.parseInt(line);
			}
		}
		
	/*	funcion lambda */
	 	calorias.sort((a , b) -> {
			return b - a;
		}); 
		
		/* sort con collections.reverseOrder()
		 * calorias.sort(Collection.reverseOrder());
		 */
		
		/* sort con Collection clase */
		//Collections.sort(calorias, Collections.reverseOrder());
		
		double fin = System.currentTimeMillis();
		System.out.println(calorias.get(0));
		System.out.println((fin - inicio));
	}

}
