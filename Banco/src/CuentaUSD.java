
public class CuentaUSD extends Cuenta{

	

	public CuentaUSD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaUSD(int numeroCuenta, double saldo, String titular, Cliente cliente) {
		super(numeroCuenta, saldo, titular, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean retiro(double retiro) {

		retiro *= 1.1;
		return super.retiro(retiro);
	}


	
}
