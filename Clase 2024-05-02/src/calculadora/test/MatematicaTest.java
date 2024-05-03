package calculadora.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import calculadora.Calculadora;
import calculadora.Matematica;

class MatematicaTest {
	
	@InjectMocks
	Matematica matematica;
	
	@Mock
	Calculadora calculadora;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		
	}
	
	@Test 
	public void sumarRestar() {
		when(calculadora.sumar(4, 6)).thenReturn(10);
		when(calculadora.restar(6, 4)).thenReturn(2);
		
		int resultado = matematica.sumarRestar("Sumar", 4, 6);
		
		assertTrue( resultado == 10);
		
		resultado = matematica.sumarRestar("Restar", 6, 4);
		assertTrue( resultado == 2);
	}

//	Calculadora calculadora;
//	
//	public Matematica() {
//		calculadora = new Calculadora();
//	}
}
