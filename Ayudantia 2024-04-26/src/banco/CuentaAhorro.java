package banco;

public class CuentaAhorro extends Cuenta{
	private int numRetiro;
	
	
	public CuentaAhorro() {
		super();
		this.numRetiro = 5;
	}

	@Override
	public boolean depositar(double deposito) {
		saldo += deposito;
		return true;
	}

	@Override
	public boolean retirar(double retiro)  {
		if(saldo >= retiro && numRetiro > 0) {
			saldo -= retiro;
			return true;
		}
		return false;
	}

}
