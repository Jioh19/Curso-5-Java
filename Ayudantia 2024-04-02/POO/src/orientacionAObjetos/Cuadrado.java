package orientacionAObjetos;

public class Cuadrado {
	int lado;
	String nombre;
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(int lado, String nombre) {
		super();
		this.lado = lado;
		this.nombre = nombre;
	}
	
	public int getArea() {
		return lado*lado;
	}
	
	public String getNombre() {
		return nombre;
	}
		
	
}
