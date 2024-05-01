package banco.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import banco.Cliente;
import banco.Cuenta;
import banco.CuentaAhorro;
import banco.CuentaDolar;
import banco.CuentaEuro;
import banco.CuentaVista;

class ClienteTest {

	Cliente cliente;
	Cuenta cuentaAhorro;
	Cuenta cuentaVista;
	Cuenta cuentaDolar;
	Cuenta cuentaEuro;
	
	
	@BeforeEach
	public void instanciar() {
		cliente = new Cliente("Juan", "Oh", "123456789", "987654321");
		cuentaAhorro = new CuentaAhorro();
		cuentaVista = new CuentaVista();
		cuentaDolar = new CuentaDolar();
		cuentaEuro = new CuentaEuro();
		cliente.addCuenta(cuentaAhorro);
		cliente.addCuenta(cuentaVista);
		cliente.addCuenta(cuentaDolar);
		cliente.addCuenta(cuentaEuro);
		
		cuentaAhorro.depositar(200000);
		cuentaVista.depositar(69420);
		cuentaDolar.depositar(10000);
		cuentaEuro.depositar(5000);
		
	}
	@ParameterizedTest
	@ValueSource(doubles = {0, 200000})
	@DisplayName("Prueba exitosa")
	void transferir(double monto) {
		boolean resultado = cliente.transferir(0, 0, monto);
		System.out.println(monto + " " + resultado);
		assertTrue(resultado);
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {200001, 5000000})
	@DisplayName("Prueba fracasada")
	void transferir2(double monto) {
		boolean resultado = cliente.transferir(0, 0, monto);
		System.out.println(monto + " " + resultado);
		assertFalse(resultado);
	}
}
