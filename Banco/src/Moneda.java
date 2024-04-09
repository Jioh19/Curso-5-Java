
public interface Moneda {
	public String getSimbolo();
	public Double getFactorConversion();
	public Double convertir(double monto, double factorConversion);
}
