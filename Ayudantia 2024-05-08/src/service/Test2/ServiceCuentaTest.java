package service.Test2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import model.Cuenta;
import service.ServiceCuenta;

class ServiceCuentaTest {

	//ServiceCuenta serviceCuenta = new ServiceCuenta();
	
//	@InjectMocks
	ServiceCuenta serviceCuenta = new ServiceCuenta();
	
	//@Mock
//	Cuenta cuenta;
	Cuenta cuenta = new Cuenta(123456);
	
//	@BeforeEach
//	public void init() {
//		MockitoAnnotations.openMocks(this);
//
//	}
//	
	@Test
	void testDepositar() {
		//when(cuenta.getSaldo()).thenReturn(0.0);
		double inicial = cuenta.getSaldo();
		double monto = 100000;
		//when(serviceCuenta.depositar(cuenta, 1000)).thenReturn(true);
		boolean exito = serviceCuenta.depositar(cuenta, 1000);
		double termino = cuenta.getSaldo();
		//assertEquals(inicial, 0);
		assertTrue(exito);
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
