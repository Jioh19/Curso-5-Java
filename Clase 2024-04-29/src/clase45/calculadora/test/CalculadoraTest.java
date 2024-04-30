package clase45.calculadora.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import clase45.calculadora.Calculadora;

class CalculadoraTest {

	@Test
	public void sumarTest() {
		
		Calculadora calculadora = new Calculadora();
		
		assertEquals(6, calculadora.sumar(4, 2));
	}
	
}
