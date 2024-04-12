package com.always.init;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Hola mundo!!!!");
		//String palabra = sc.nextLine();
		//System.out.println(palabra);
		
//		System.out.println(sumar(100, 49));
//		double numero = 123.456;
//		int numero2 = (int)numero;
//		System.out.println(numero+ " " +numero2);
//		int nums = 49420;
//		double nums2 = nums;
//		String text = "123456";
//		double text2 = Double.parseDouble(text);
//		System.out.println(text2);
//		int text3 = 69420;
//		String text4 = Integer.toString(text3);
//		System.out.println(text4);
//		
		System.out.println((int)(Math.random() *1000 +10));
		System.out.println(new Random().nextInt(1000));
	}
	
	public static double sumar(double a, double b) {
		return a + b;
	}
//	function sumar(a, b) {
//		return a + b;
//	}

}
