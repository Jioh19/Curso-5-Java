package conversor;

public class Moneda {
	private String nombre;
	private double tasa;
	private String codigo;
	
	public Moneda(String nombre, double tasa, String codigo) {
		super();
		this.nombre = nombre;
		this.tasa = tasa;
		this.codigo = codigo;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Moneda [nombre=" + nombre + ", tasa=" + tasa + ", codigo=" + codigo + "]";
	}
	
	
}
