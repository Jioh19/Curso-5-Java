package com.always.segundo;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Random;

public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto.bocina();
		System.out.println(System.currentTimeMillis());
		System.out.println(Auto.PI);
		
		System.out.println(Math.random());
		System.out.println(new Random().nextInt(1000));
		Auto audi = new Auto(100, 100.0, 10.0);
		Auto ferrari = new Auto(90, 120, 15.0);
		Auto toyota = new Auto(110, 80, 6.0);
		Auto kia = new Auto(110, 75, 6.5);

		ArrayList<Auto> autos = new ArrayList<>();
		autos.add(audi);
		autos.add(ferrari);
		autos.add(toyota);
		autos.add(kia);

		while (autos.get(0).avanzar(15) || autos.get(1).avanzar(15) || autos.get(2).avanzar(15)
				|| autos.get(3).avanzar(15)) {

		}
		String palabra = "jfkldsjkgldsjl";
		palabra.length();
		int arreglo[] = new int[10];
		int largo = arreglo.length;
		
		largo = autos.size();
	
 		for (int i = 0; i < autos.size(); i++) {
			System.out.println(autos.get(i));
		}
//		for(Auto auto : autos) {
//			System.out.println(auto.getDistancia());
//			auto.avanzar(15);
//			System.out.println(auto.toString());
//		}
	}

}
