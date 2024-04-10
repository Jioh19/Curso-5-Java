
public class Efectivo implements FormaPago{

	
	
	public Efectivo() {
		super();
	}

	@Override
	public void procesarPago() {
		System.out.println("Pagaste en efectivo KACHING!!!!");
	}
	
}
