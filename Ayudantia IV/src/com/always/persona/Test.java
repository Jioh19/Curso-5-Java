package com.always.persona;

public class Test {

	public static void main(String[] args) {
		Persona yo = new Persona("Juan", "Oh", 42);
		Persona copiaYo = yo;
//		int num1 = 69420;
//		int copiaNum = num1;
//
//		
//		copiaNum = 1;
//		
//		System.out.println(num1);
//		System.out.println(copiaNum);
		
		copiaYo.edad = 12;
		System.out.println(yo);
		System.out.println(copiaYo);
	}

}
