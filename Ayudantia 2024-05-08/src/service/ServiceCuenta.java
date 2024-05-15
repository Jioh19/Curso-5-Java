package service;

import model.Cuenta;

public class ServiceCuenta {

	public boolean depositar(Cuenta cuenta, double monto) {
		cuenta.setSaldo(cuenta.getSaldo() + monto);
		return true;
	}
	
	public boolean retirar(Cuenta cuenta, double monto) {
		if(cuenta.getSaldo() < monto) {
			return false;
		}
		cuenta.setSaldo(cuenta.getSaldo() - monto);
		return true;
	}
}
