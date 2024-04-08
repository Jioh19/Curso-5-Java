
public class Cuenta {
	private int cuenta;
	private String titular;
	private double saldo;
	public Cuenta(int cuenta, String titular, double saldo) {
		super();
		this.cuenta = cuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}

	public void depositar(double deposito) {
		saldo += deposito;
	}
}
