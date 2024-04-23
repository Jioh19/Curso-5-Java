package com.always.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutaciones {
	
	public static void permutacion(String str, String curr, List<String> permu) {
		if(str.isEmpty()) {
			permu.add(curr);
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String remanente = str.substring(0, i) + str.substring(i + 1);
			permutacion(remanente, curr + c, permu);
		}
		// str = "abcdef" curr = "" => str = "bcdef curr = "a" => str = "cdef" curr = "ab"
	}

	public static void main(String[] args) {
		
		ArrayList<String> permu = new ArrayList<>();
		String input = "abcdefghijkl"; // 1*2*3*4*5*6
		permutacion(input, "", permu);
		
		for(String str : permu) {
			System.out.println(str);
		}
		
		System.out.println(permu.size());
	}
}
