import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Dolar dolar = new Dolar();
		Euro euro = new Euro();
		
		System.out.printf("100,000 pesos chilenos equivalen a: %.2f dolares\n", dolar.convertir(100000, 1));
		System.out.printf("100,000 pesos chilenos equivalen a: %.2f euros\n", euro.convertir(100000, 1));
		FormaPago fp;
		
		fp = new TarjetaCredito();
		fp.procesarPago();
		
		fp = new Efectivo();
		fp.procesarPago();
		
		fp = new PayPal();
		fp.procesarPago();
		
		final String os = System.getProperty("os.name");
		if(os.contains("Linux")) {
			System.out.print("\033[H\033[2J");			
		} else {
			try {
				Runtime.getRuntime().exec("cls");
				
			}
			catch (final Exception e) {
				e.printStackTrace();
			}
		}
	}

}
