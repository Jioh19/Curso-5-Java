package figuras;

import java.util.ArrayList;

public class FiguraComposite extends Figura{
	ArrayList<Figura> figuras;

	
	public FiguraComposite() {
		super();
		this.figuras = new ArrayList<>();
	}


	@Override
	public double getArea() {
		double total = 0;
		
		for(Figura figura : figuras) {
			total += figura.getArea();
		}
		return total;
	}
	
	public void addFigura(Figura figura) {
		figuras.add(figura);
	}
}
