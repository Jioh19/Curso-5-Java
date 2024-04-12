package com.always.init;

public class Trencito {

	public static void main(String[] args) {
		double area = 0;
		area += cuadrado(1);
		area += cuadrado(2); // area = area + cuadrado(2)
		area += rectangulo(2, 5);
		area += triangulo(1, 1);
		area += 3*circulo(1);
		System.out.println("El area del trencito es de " + area);
		
	}
	
	public static double cuadrado(double lado) {
		return Math.pow(lado,  2);
	}
	
	public static double rectangulo(double lado, double alto) {
		return lado * alto;
	}
	
	public static double triangulo(double base, double altura) {
		return base * altura * 0.5;
	}
	
	public static double circulo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
}
