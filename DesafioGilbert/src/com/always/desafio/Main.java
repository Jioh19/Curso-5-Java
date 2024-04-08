package com.always.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		String original = "FzpFXPzJZavPWWWFxZwFWWzZWZpfapkKPPTPXpZpZwkPfzPZKTpwzZezZs"
				+ "TFgWxPpzwPfepnpiWwfZPWZfzalWkPPZZwXzfWJzXXaKzpFpzpwPJXaZtXKfXzX"
				+ "TtPXPwwJwPXpxZFaPzwZZpwZzKwXzTKfPZKTFFxP..ZwZW.WpXFTxwPwPKwTPxxX"
				+ "KZZzktzZ:ppwwZzZzZW)zxwPxZWZWzFXxfZwTFwffXZZfxWWZwXwPZwp";
		original = original.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < original.length(); i++) {
			if(map.get(original.charAt(i)) == null) {
				map.put(original.charAt(i), 1);
			} else {
				map.put(original.charAt(i), map.get(original.charAt(i))+1);
			}
		}
		MapComparator comparator = new MapComparator(map);
		Map<Character,Integer> newMap = new TreeMap(comparator);
	    newMap.putAll(map);

	    for(int i = 0; i < 5; i++) {
	    	original = original.replaceAll(newMap.keySet().toArray()[i].toString(), "");
	    }
	    for(int i = 5; i < 7; i++) {
	    	original = original.replaceAll(newMap.keySet().toArray()[i].toString(), " ");
	    }
	    System.out.println(original);
	}

}
