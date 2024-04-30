package banco;

import java.util.Random;

public abstract class Cuenta {
	protected int numero;
	protected double saldo;
	protected Moneda moneda;
	
	public Cuenta(Moneda moneda) {
		super();
		this.numero = new Random().nextInt(10000000) + 1000000;
		this.saldo = 0;
		this.moneda = moneda;
	}
	public abstract boolean depositar(double deposito);
	public abstract boolean retirar(double retiro);
	@Override
	public String toString() {
		//*****************************************************
		return String.format("**%15s%-10s%10s%12.2f  **\n", "Numero Cta:", 
				Integer.toString(numero), "Saldo:", saldo)+
				String.format("**%15s%-10s%10s%12s  **\n", "Moneda:", 
						moneda, "", "");
		//return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
