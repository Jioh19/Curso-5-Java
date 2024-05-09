package service;

import model.Cuenta;

public class ServiceCuenta {

	public void depositar(Cuenta cuenta, double monto) {
		cuenta.setSaldo(cuenta.getSaldo() + monto);
	}
	
	public boolean retirar(Cuenta cuenta, double monto) {
		if(cuenta.getSaldo() < monto) {
			return false;
		}
		cuenta.setSaldo(cuenta.getSaldo() - monto);
		return true;
	}
}
