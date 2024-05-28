package com.always.arreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(-50);
		numeros.add(900);
		numeros.add(-669);
		numeros.add(-123);
		numeros = numeros.stream().filter(num -> (num < 0)).peek(System.out::println).
				filter(num -> (num > -200)).peek(num -> System.out.println(num)).toList();
	}

}
