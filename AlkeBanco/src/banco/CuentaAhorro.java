package banco;

public class CuentaAhorro extends Cuenta{
	private int numRetiro;
	
	
	public CuentaAhorro() {
		super(Moneda.CLP);
		this.numRetiro = 5;
	}

	@Override
	public boolean depositar(double deposito) {
		saldo += deposito;
		return true;
	}

	/**
	 * @param double retiro
	 * @return boolean
	 */
	@Override
	public boolean retirar(double retiro)  {
		if(saldo >= retiro && numRetiro > 0) {
			saldo -= retiro;
			numRetiro--;
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 */
	public void resetRetiro() {
	numRetiro = 5;
	}

	@Override
	public boolean seeDepositar(double deposito) {
		return true;
	}

	@Override
	public boolean seeRetirar(double retiro) {
		if(saldo >= retiro && numRetiro > 0) {
			return true;
		}
		return false;
	}

}
