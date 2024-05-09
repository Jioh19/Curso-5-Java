package service.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import model.Cuenta;
import service.ServiceCuenta;

class ServiceCuentaTest {

	ServiceCuenta serviceCuenta = new ServiceCuenta();
	Cuenta cuenta = new Cuenta(123456);
	
	@Test
	void testDepositar() {
		double inicial = cuenta.getSaldo();
		double monto = 100000;
		serviceCuenta.depositar(cuenta, monto);
		double termino = cuenta.getSaldo();
		assertEquals(inicial, termino, monto);
	}

	@Test
	void testRetirar() {
		double monto = 100000;
		serviceCuenta.depositar(cuenta, monto);
		double inicial = cuenta.getSaldo();
		var retiro = 50000;
		serviceCuenta.retirar(cuenta, 50000);
		var termino = cuenta.getSaldo();
		assertEquals(inicial, termino, 50000);
	}
	
	@Test 
	void testRetiroFallido() {
		double monto = 100000;
		serviceCuenta.depositar(cuenta, monto);
		double inicial = cuenta.getSaldo();
		var retiro = 500000;
		boolean exito = serviceCuenta.retirar(cuenta, retiro);
		var termino = cuenta.getSaldo();
		assertFalse(exito);
	}

}
