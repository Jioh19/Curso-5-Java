package com.always.init;

import java.util.HashMap;
import java.util.Map;

public class RomanoGilbert {
	public static void main(String[] args) {
		/**
		 * declaramos un hasmap agreamos al hashmap la letra (key), y su valor numerico
		 * (value) una hashmap contiene elementos clave , valor
		 */
		Map<Character, Integer> numerosRomanos = new HashMap<>();
		numerosRomanos.put('M', 1000);
		numerosRomanos.put('D', 500);
		numerosRomanos.put('C', 100);
		numerosRomanos.put('L', 50);
		numerosRomanos.put('X', 10);
		numerosRomanos.put('V', 5);
		numerosRomanos.put('I', 1);

		System.out.println(romanoAArabigo("MMXX", numerosRomanos));
	}

	public static int romanoAArabigo(String valorRomano, Map<Character, Integer> numerosRomanos) {
		// declaramos una variable entera para guaradar el total
		int total = 0;
		// declaramos una variable entera que guarde el valor anterior
		int prevValor = 0;
		// recorremos el largo del String de forma inversa
		for (int i = valorRomano.length() - 1; i >= 0; i--) {
			// obtenemos la letra del string segun su indice(posicion en el string) con
			// chartAt
			char letra = valorRomano.charAt(i);
			// obtenemos el valor numerico de la letra(key) en el hashmap
			int valor = numerosRomanos.get(letra);
			// si el valor es mayor o igual al prevalor se lo agregamos al total
			if (valor >= prevValor) {
				total += valor;
				// si no se cumple la condicion anterior restamos al total el valor
			} else {
				total -= valor;
			}
			// dejamos el valor actual como valor anterior
			prevValor = valor;
		}
		// devolvemos el total
		return total;
	}
}
