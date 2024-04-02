package orientacionAObjetos;

public class Circulo extends Cuadrado{

	public Circulo(int lado, String nombre) {
		super(lado, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return (int)(Math.PI * lado*lado);
	}
	
	
}
