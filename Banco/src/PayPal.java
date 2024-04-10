
public class PayPal implements FormaPago{

	
	
	public PayPal() {
		super();
	}

	@Override
	public void procesarPago() {
		System.out.println("Estas pagando paypal");
	}

}
