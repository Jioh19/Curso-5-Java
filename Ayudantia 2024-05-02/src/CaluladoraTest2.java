import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CaluladoraTest2 {
	
	Calculadora calculadora = new Calculadora();
	@Test
	void multiplicarTest() {
		double num1 = 12;
		double num2 = 13;
		double resultado = calculadora.multiplicar(num1, num2);
		assertEquals(resultado, num1*num2, 0);
	}
	
	@Test
	void dividirTest() {
		double num1 = 12;
		double num2 = 13;
		double resultado = calculadora.dividir(num1, num2);
		assertEquals(resultado, num1/num2, 0);
	}
}
