package banco.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import banco.CuentaAhorro;

class CuentaAhorroTest {

	@Test
	public void depositarTest() {
		
		CuentaAhorro cuenta = new CuentaAhorro();
		double saldoInicial = cuenta.getSaldo();
		System.out.println("SaldoInicial: " + saldoInicial);
		
		double deposito = 40000;
		boolean resultado = cuenta.depositar(deposito);
		double saldoPostDeposito = cuenta.getSaldo();
		System.out.println("SaldoPostDeposito: " + saldoPostDeposito);
		
		assertNotEquals(saldoInicial, saldoPostDeposito);
		assertTrue(resultado);
	}
	
	@Test
	public void retirarTest() {
		CuentaAhorro cuenta = new CuentaAhorro();
		cuenta.setSaldo(500000);
		double saldoInicial = cuenta.getSaldo();
		System.out.println("SaldoInicial: " + saldoInicial);
		
		boolean resultado = cuenta.retirar(100000);
		double saldoPostRetiro = cuenta.getSaldo();
		System.out.println("SaldoPostRetiro: " +saldoPostRetiro);
		
		assertNotEquals(saldoInicial, saldoPostRetiro);
		assertTrue(resultado);
	}

}
