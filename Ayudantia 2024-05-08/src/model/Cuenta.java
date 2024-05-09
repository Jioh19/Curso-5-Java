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
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
