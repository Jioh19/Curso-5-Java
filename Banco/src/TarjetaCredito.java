
public class TarjetaCredito implements FormaPago{

	
	public TarjetaCredito() {
		super();
	}

	@Override
	public void procesarPago() {
		System.out.println("Estas pagando con 3 cuotas sin interes");
	}
	
}
