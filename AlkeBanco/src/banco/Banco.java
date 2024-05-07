package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente("Juan", "Oh", "123456789", "987654321");
		Cliente cliente2 = new Cliente("Alexis", "Santander", "321564789", "445612");

		Cuenta cuentaAhorro = new CuentaAhorro();
		Cuenta cuentaVista = new CuentaVista();
		Cuenta cuentaDolar = new CuentaDolar();
		Cuenta cuentaEuro = new CuentaEuro();
		Cuenta cuentaAhorro2 = new CuentaAhorro();
		Cuenta cuentaVista2 = new CuentaVista();
		Cuenta cuentaDolar2 = new CuentaDolar();
		Cuenta cuentaEuro2 = new CuentaEuro();

		cliente.addCuenta(cuentaAhorro);
		cliente.addCuenta(cuentaVista);
		cliente.addCuenta(cuentaDolar);
		cliente.addCuenta(cuentaEuro);

		cliente2.addCuenta(cuentaAhorro2);
		cliente2.addCuenta(cuentaVista2);
		cliente2.addCuenta(cuentaDolar2);
		cliente2.addCuenta(cuentaEuro2);

		cuentaAhorro.depositar(200000);
		cuentaVista.depositar(69420);
		cuentaDolar.depositar(10000);
		cuentaEuro.depositar(5000);

		cuentaAhorro2.depositar(700000);
		cuentaVista2.depositar(109420);
		cuentaDolar2.depositar(20000);
		cuentaEuro2.depositar(10000);

		cliente.transferir(0, 1, 100000);
		
		transferenciaCliente(cliente2, cliente, 0, 0, 543320);
		cliente2.transferir(2,0, 1000);

		Menu.printMenu(cliente.getCuentas());
		System.out.println(cliente);
		System.out.println(cliente2);

	}

	public static boolean transferenciaCliente(Cliente clienteOrigen, Cliente clienteDestino, int origen, int destino,
			double monto) {
		Cuenta cuentaOrigen = clienteOrigen.getCuentas().get(origen);
		Cuenta cuentaDestino = clienteDestino.getCuentas().get(destino);
		if (cuentaOrigen.getMoneda() != cuentaDestino.getMoneda()) {
			return false;
		}

		if (cuentaOrigen.seeRetirar(monto) && cuentaDestino.seeDepositar(monto)) {
			cuentaOrigen.retirar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}

}
