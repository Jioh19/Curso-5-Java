package com.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumarTest() {
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar(3, 3);
		assertEquals(6, resultado);
	}

}
