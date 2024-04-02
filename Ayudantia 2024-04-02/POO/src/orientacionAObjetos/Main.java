package orientacionAObjetos;

public class Main {

	public static void main(String[] args) {
		
		Cuadrado cuad = new Cuadrado(10, "Soy EL cuadrado");
		
		//System.out.println("El area del cuadrado es " + cuad.getArea());
		//System.out.println("Me llamo " + cuad.getNombre());
		
		Cuadrado rect = new Rectangulo(5, 10, "Soy EL rectangulo");
		
		//System.out.println("El area del rectangulo es " + rect.getArea());
		//System.out.println("Me llamo " + rect.getNombre());
		
		Cuadrado circ = new Circulo(5, "Soy EL circulo");
		
		//System.out.println("El area del circulo es " + circ.getArea());
		//System.out.println("Me llamo " + circ.getNombre());
		
		Cuadrado figuras[] = new Cuadrado[3];
		figuras[0] = cuad;
		figuras[1] = rect;
		figuras[2] = circ;
		
		for(Cuadrado fig : figuras) {
			System.out.println("Me llamo " + fig.getNombre());
			System.out.println("El area es "+ fig.getArea());
		}
	}

}
