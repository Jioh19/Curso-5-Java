package com.always.segundo;

import java.util.HashMap;

public class Mapa {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("I", 1);
		mapa.put("V", 5);
		mapa.put("X", 10);
		mapa.put("L", 50);
		mapa.put("C", 100);
		mapa.put("D", 500);
		mapa.put("M", 1000);
		
		String numero = "MMCDXXXIII";
		
		System.out.println(mapa.get("D"));
		
	}

}
