package banco;

import java.util.Random;

public abstract class Cuenta {
	protected int numero;
	protected double saldo;
	
	public Cuenta() {
		super();
		this.numero = new Random().nextInt(10000000) + 1000000;
		this.saldo = 0;
	}
	public abstract boolean depositar(double deposito);
	public abstract boolean retirar(double retiro);
	@Override
	public String toString() {
		//*****************************************************
		return String.format("**%15s%-10s%10s%-14s**\n", "Numero Cta:", 
				Integer.toString(numero), "Saldo:", Double.toString(saldo));
		//return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
}
