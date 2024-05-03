package banco.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;

import banco.CuentaAhorro;

class CuentaAhorroTest {
	CuentaAhorro cuenta;
	

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
		cuenta = new CuentaAhorro();
	}
	
	@AfterEach
	public void limpiar() {
		System.out.println("Se ejecuta despues de cada test unitario");
		cuenta = null;
	}
	
	@DisplayName("prueba-depositar")
	@Test
	public void depositarTest() {
		
		double saldoInicial = cuenta.getSaldo();
		//System.out.println("SaldoInicial: " + saldoInicial);
		
		double deposito = 40000;
		boolean resultado = cuenta.depositar(deposito);
		double saldoPostDeposito = cuenta.getSaldo();
	//	System.out.println("SaldoPostDeposito: " + saldoPostDeposito);
		
		assertNotEquals(saldoInicial, saldoPostDeposito);
		assertTrue(resultado);
	}
	
	@Disabled
	//@RepeatedTest(3)
	@ParameterizedTest
	//@ValueSource(doubles = {2000, 3000, 4000})
	@DisplayName("prueba-retirar")
	//@RepeatedTest(value = 4, name="{displayName} - Repetición número {currentRepetition} de {totalRepetition}")
	public void retirarTest(RepetitionInfo info) {
		cuenta.setSaldo(500000);
		double saldoInicial = cuenta.getSaldo();
	//	System.out.println("SaldoInicial: " + saldoInicial);
		
		boolean resultado = cuenta.retirar(300000);
		double saldoPostRetiro = cuenta.getSaldo();
	//	System.out.println("SaldoPostRetiro: " +saldoPostRetiro);
		
		if(info.getCurrentRepetition() == 2) {
			System.out.println("Estamos en la repetición 2");
			System.out.println("saldoPostRetiro: " + saldoPostRetiro);
		}
		
		assertNotEquals(saldoInicial, saldoPostRetiro);
		assertTrue(resultado);
		
		cuenta.setSaldo(0);
		resultado = cuenta.retirar(100);
		assertFalse(resultado);
	//	System.out.println("SaldoInicial: " + saldoInicial);
	//	System.out.println("SaldoPostRetiro: " +saldoPostRetiro);

	}
	
	@Test
	@Timeout(3)
	void pruebaTimeOut() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}

}
