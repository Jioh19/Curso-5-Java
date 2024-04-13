package com.always.init;

public class Romano {

	public static void main(String[] args) {
		//Se va a ingresar a traves de un String un numero romano que este
		// sintacticamente correcto. Transformar dicho numero romano a int
		//Ej: MMCCLXII = 2262
		//I = 1
		//III = 3
		//IV = 4
		//V = 5
		//X = 10
		//XL = 40
		//L = 50
		//C = 100
		//CD = 400
		//D = 500
		//M = 1000.
		int total = 0;
		String romano = "MMMCDLXXIV"; //3474
		for(int i = 0; i < romano.length(); i++) {
			//System.out.println(romano.charAt(i));
			char c = romano.charAt(i);
			boolean prox = true;
			if(i == romano.length() -1) {
				prox = false;
			}
			switch(c) {
			case 'M':
				total += 1000;
				break;
			case 'D':
				total += 500;
				break;
			case 'C':
				if(prox) {
					if(romano.charAt(i+1) == 'D' ) {
						total -=100;
						break;
					}
				}
				total += 100;
				break;
			case 'L':
				total += 50;
				break;
			case 'X':
				if(prox) {
					if(romano.charAt(i+1) == 'L' ) {
						total -=10;
						break;
					}
				}
				total += 10;
				break;
			case 'V':
				total += 5;
				break;
			case 'I':
				if(prox) {
					if(romano.charAt(i+1) == 'V' ) {
						total -=1;
						break;
					}
				}
				total += 1;
				break;
			}
				
			
		}
		System.out.println(total);
		
	}	

}
