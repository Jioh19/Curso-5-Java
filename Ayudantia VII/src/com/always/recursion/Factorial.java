package com.always.recursion;

public class Factorial {
	
	public static int calcularFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * calcularFactorial(num-1);
		
		// 10 * cF(9) => 10 * (9 * cF(8)) => 10 * 9 * (8 * cF(7)) => ... => 10*9*8*7*6*5*4*3*2*cF(1)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n! = 1*2*3*4*...*(n-1)*n
		int n = 12;
		int result = calcularFactorial(n);
		
		System.out.println(result);
	}

}
