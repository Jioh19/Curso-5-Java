package com.always.advent1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class advent1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input1.txt");
		Scanner sc = new Scanner(file);
		String line = sc.nextLine();
		System.out.println(line);
		
		int result = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '(') {
				result++;
			}
			if(line.charAt(i) == ')') {
				result--;
			}
		}
		
		System.out.println(result);
		
		result = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '(') {
				result++;
			}
			if(line.charAt(i) == ')') {
				result--;
			}
			if(result == -1) {
				System.out.println(i);
				break;
			}
		}
	}

}
