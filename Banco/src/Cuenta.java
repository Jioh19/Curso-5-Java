
public abstract class Cuenta {
	
	private int numeroCuenta;
	private double balance;
	private String alias;
	private Cliente cliente;
	
	
	public Cuenta() {
		super();
	}

	public Cuenta(int numeroCuenta, double saldo, String titular, Cliente cliente) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.balance = saldo;
		this.alias = titular;
		this.setCliente(cliente);
	}

	public abstract void verificarFondos();
	
	
	public void depositar(double deposito) {
		balance += deposito;
	}
	
	public boolean retiro(double retiro) {
		if(balance < retiro) {
			return false;
		}
		balance -= retiro;
		return true;
	}

	@Override
	public String toString() {
		return "\n" + this.getClass().toString().split(" ")[1] + " [numeroCuenta=" + numeroCuenta + ", balance=" + 
	Math.round(balance) + ", alias=" + alias +"]";
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
