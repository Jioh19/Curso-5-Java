package figuras;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FiguraComposite vagon = new FiguraComposite();
		FiguraComposite carro = new FiguraComposite();
		
		Figura rect1 = new Rectangulo(3, 1);
		Figura rect2 = new Rectangulo(5, 2);
		Figura triangulo = new Triangulo(1,1);
		Figura circulo = new Circulo(1);
		
		Figura cuad1 = new Cuadrado(1);
		Figura cuad2 = new Cuadrado(2);
		Figura rect3 = new Rectangulo(5, 1);
		
		
		vagon.addFigura(rect1);
		vagon.addFigura(rect2);
		vagon.addFigura(triangulo);
		vagon.addFigura(triangulo);
		vagon.addFigura(circulo);
		vagon.addFigura(circulo);
		
		carro.addFigura(cuad1);
		carro.addFigura(cuad2);
		carro.addFigura(rect3);
		carro.addFigura(triangulo);
		carro.addFigura(circulo);
		carro.addFigura(circulo);
		carro.addFigura(circulo);
		
		
		System.out.println("El volumen del vagon es " + vagon.getArea());
		System.out.println("El volumen del carro es " + carro.getArea());
	}

}
