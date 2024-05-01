package banco;

public class CuentaVista extends Cuenta{
	
	private double maxDeposito;
	private double depositoActual;
	
	
	public CuentaVista() {
		super(Moneda.CLP);
		this.maxDeposito = 5000000;
		this.depositoActual = 0;
	}

	@Override
	public boolean depositar(double deposito) {
		if(maxDeposito < (depositoActual+deposito)) {
			return false;
		}
		saldo += deposito;
		depositoActual += deposito;
		return true;
	}

	@Override
	public boolean retirar(double retiro) {
		if(saldo < retiro) {
			return false;
		}
		saldo -= retiro;
		return true;
	}
	
	public void resetSaldo() {
		depositoActual = 0;
	}

	public double getMaxDeposito() {
		return maxDeposito;
	}

	public void setMaxDeposito(double maxDeposito) {
		this.maxDeposito = maxDeposito;
	}

	public double getDepositoActual() {
		return depositoActual;
	}

	public void setDepositoActual(double depositoActual) {
		this.depositoActual = depositoActual;
	}

	
}
