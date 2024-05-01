package banco.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import banco.CuentaVista;

class CuentaVistaTest {

	@Test
	void depositarTest() {
		//no poder realizar el deposito
		CuentaVista ctaVista = new CuentaVista();
		ctaVista.setDepositoActual(5000000);
		boolean resultado = ctaVista.depositar(300);
		assertFalse(resultado);
		
		//caso de prueba cuando se pueda realizar el deposito
		ctaVista.setDepositoActual(0);
		resultado = ctaVista.depositar(40000);
		assertTrue(resultado);
	}
	
	@Test 
	void retirarTest() {
		CuentaVista ctaVista = new CuentaVista();
		ctaVista.setSaldo(500000);
		double saldoInicial = ctaVista.getSaldo();
		boolean resultado = ctaVista.retirar(300000);
		double saldoFinal = ctaVista.getSaldo();
		assertTrue(resultado);
		assertNotEquals(saldoInicial, saldoFinal);
		
		ctaVista.setSaldo(200000);
		saldoInicial = ctaVista.getSaldo();
		resultado = ctaVista.retirar(300000);
		saldoFinal = ctaVista.getSaldo();
		assertFalse(resultado);
		assertEquals(saldoInicial, saldoFinal);
		
	}
}
