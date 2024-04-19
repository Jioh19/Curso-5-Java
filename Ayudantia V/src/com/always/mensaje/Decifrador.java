package com.always.mensaje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Decifrador {

	public static void main(String[] args) {
		String mensaje = "FzpFXPzJZavPWWWFxZwFWWzZWZpfapkKPPTPXpZpZwkPfzPZKTpwzZezZs"
				+ "TFgWxPpzwPfepnpiWwfZPWZfzalWkPPZZwXzfWJzXXaKzpFpzpwPJXaZtXKfXzX"
				+ "TtPXPwwJwPXpxZFaPzwZZpwZzKwXzTKfPZKTFFxP..ZwZW.WpXFTxwPwPKwTPxxX"
				+ "KZZzktzZ:ppwwZzZzZW)zxwPxZWZWzFXxfZwTFwffXZZfxWWZwXwPZwp";
		mensaje = mensaje.toLowerCase();
		Map<Character, Integer> m = new HashMap<>();
		for(int i = 0; i < mensaje.length(); i++) {
			if(m.get(mensaje.charAt(i)) == null) {
				m.put(mensaje.charAt(i), 1);
			} else {
				m.put(mensaje.charAt(i), m.get(mensaje.charAt(i))+1);
			}
		}
		
		MapComparator mp = new MapComparator(m);
		Map<Character, Integer> newM = new TreeMap(mp);
		newM.putAll(m);
		System.out.println(newM);
		
		for(int i = 0; i < 5; i++) {
			mensaje = mensaje.replaceAll(newM.keySet().toArray()[i].toString(), "");
		}
		for(int i = 5; i < 7; i++) {
			mensaje = mensaje.replaceAll(newM.keySet().toArray()[i].toString(), " ");
		}
		System.out.println(mensaje);
	}

}
