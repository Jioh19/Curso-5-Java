
public class Dolar implements Moneda{
	
	private String simbolo;
	private double factorConversion;
	
	
	public Dolar() {
		super();
		this.simbolo = "USD";
		this.factorConversion = 950;
	}

	@Override
	public String getSimbolo() {
		return simbolo;
	}

	@Override
	public Double getFactorConversion() {
		return factorConversion;
	}

	@Override
	public Double convertir(double monto, double factorConversion) {
		return monto * factorConversion / this.factorConversion;
	}

}
