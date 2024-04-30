package banco;

public class CuentaVista extends Cuenta{
	
	private double maxDeposito;
	private double depositoActual;
	
	
	public CuentaVista() {
		super();
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

}
