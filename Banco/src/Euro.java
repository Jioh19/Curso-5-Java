
public class Euro implements Moneda{

	private String simbolo;
	private double factorConversion;
	
	
	public Euro() {
		super();
		this.simbolo = "EURO";
		this.factorConversion = 1100;
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
