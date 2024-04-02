package orientacionAObjetos;

public class Rectangulo extends Cuadrado {
	int largo;



	public Rectangulo(int lado, int largo, String nombre) {
		super(lado, nombre);
		// TODO Auto-generated constructor stub
		this.largo = largo;
	}


	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return largo * lado;
	}
	
	
}
