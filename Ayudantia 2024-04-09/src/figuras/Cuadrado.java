package figuras;

public class Cuadrado extends Figura{

	private double lado;
	
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}


	@Override
	public double getArea() {
		return lado*lado;
	}

	
}
