package banco;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private String rut;
	private String password;
	List<Cuenta> cuentas;

	public Cliente(String nombre, String apellido, String rut, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.password = password;
		cuentas = new LinkedList<Cuenta>();

	}

	public void addCuenta(Cuenta c) {
		cuentas.add(c);
	}

	@Override
	public String toString() {
		String result = new String();
		for (int i = 0; i < cuentas.size(); i++) {
			result += cuentas.get(i);
		}
		// *****************************************************
		return "*****************************************************\n"
				+ String.format("**%15s%-10s%10s%-14s**\n", "Nombre:", nombre, "Apellido:", apellido)
				+ String.format("**%15s%-10s%10s%-14s**\n", "Password:", password, "RUT:", rut)
				+ "*****************************************************\n" + result
				+ "*****************************************************";

//		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", password=" + password
//				+ ", cuentas=" + cuentas + "]";
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public boolean transferir(int origen, int destino, double monto) {
		Cuenta cuentaOrigen = cuentas.get(origen);
		Cuenta cuentaDestino = cuentas.get(destino);
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
