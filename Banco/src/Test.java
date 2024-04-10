
public class Test {

	public static void main(String[] args) {
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
	}

}
