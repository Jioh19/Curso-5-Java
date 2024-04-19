package com.always.elfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double inicio = System.currentTimeMillis();
		ArrayList<Integer> calorias = new ArrayList<>();
		
//		File fl = new File("input.txt");
//		Scanner sc = new Scanner(fl);
		
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int total = 0;
		for(String line; (line = br.readLine()) != null;) {

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
		System.out.println((calorias.get(0) +calorias.get(1) + calorias.get(2) ));
		System.out.println((fin - inicio));
		
		// Hemos encontrado al elfo que lleva más calorías.
		// Ahora queremos la suma de lso 3 elfos con más calorías
	}

}
