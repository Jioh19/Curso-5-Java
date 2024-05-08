package model;

public class Cuenta {
	private int numero;
	private double saldo;
	
	public Cuenta(int numero) {
		super();
		this.numero = numero;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public boolean retirar(double monto) {
		if(saldo < monto) {
			return false;
		}
		saldo -= monto;
		return true;
	}
	
}
