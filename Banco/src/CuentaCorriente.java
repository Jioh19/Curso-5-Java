
public class CuentaCorriente extends Cuenta{

	double lineaCredito;
	public CuentaCorriente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaCorriente(int numeroCuenta, double saldo, String titular, Cliente cliente, Double linea) {
		super(numeroCuenta, saldo, titular, cliente);
		// TODO Auto-generated constructor stub
		this.lineaCredito = linea;
	}

	@Override
	public void verificarFondos() {
		System.out.println("Implementando el metodo abstracto en Cuentacorriente");
	}

	
}
