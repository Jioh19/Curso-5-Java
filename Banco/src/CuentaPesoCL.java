
public class CuentaPesoCL extends Cuenta{

	public CuentaPesoCL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaPesoCL(int numeroCuenta, double saldo, String titular, Cliente cliente) {
		super(numeroCuenta, saldo, titular, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verificarFondos() {
		System.out.println("Implmentando el metodo abstracto en Cuentapeso");
	}
	
}
