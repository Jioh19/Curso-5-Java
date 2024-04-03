package alkewallet;

public class Cuenta {
	int numeroCuenta;
	String titular;
	double saldo;
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	

}
