import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	@Test
	void sumarTest() {
		double sumando1 = 10;
		double sumando2 = 20;
		double resultado = calculadora.sumar(sumando1, sumando2); 
		assertEquals(resultado, sumando1+sumando2, 0);
	}

	@Test
	void restarTest() {
		double num1 = 50;
		double num2 = 20;
		double resultado = calculadora.restar(num1,  num2);
		assertEquals(resultado, num1-num2, 0);
	}
	

}
