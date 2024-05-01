package clase45.calculadora.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase45.calculadora.Calculadora;

class CalculadoraTest {
	Calculadora calc;

	@BeforeAll
	public static void primero() {
		System.out.println("Se ejecuta primero por única vez");
	}
	
	@AfterAll
	public static void ultimo() {
		System.out.println("Se ejecuta al último por única vez");
	}
	
	@BeforeEach
	public void instanciar() {
		System.out.println("Se ejecuta antes de cada test unitario");
		calc = new Calculadora();
	}
	
	@AfterEach
	public void limpiar() {
		System.out.println("Se ejecuta despues de cada test unitario");
		calc = null;
	}
	
	@Test
	public void sumarTest() {
		assertEquals(6, calc.sumar(4, 2));
	}
	
	@Test
	public void restarTest() {
		assertEquals(2, calc.restar(4, 2));
	}
	
	@Test
	public void multiplicarTest() {
		assertEquals(8, calc.multiplicar(4, 2));
	}
	
	@Test
	public void dividirTest() {
		assertEquals(2, calc.division(4, 2));
	}
	
}
