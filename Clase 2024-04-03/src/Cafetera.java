
public class Cafetera {
	private int capacidadMaxima;
	private int capacidadActual;
	
	public Cafetera(int capacidadMaxima, int capacidadActual) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
	}
	public Cafetera() {
		super();
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCapacidadActual() {
		return capacidadActual;
	}
	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	public void llenarCafetera() {
		capacidadActual = capacidadMaxima;
	}
	
	public boolean servirTaza(int taza) {
		if(capacidadActual < taza) {
			capacidadActual = 0;
			return false;
		} else {
			capacidadActual -= taza;
			return true;
		}
	}
	
	public int vaciarCafetera() {
		int aux = capacidadActual;
		capacidadActual = 0;
		return aux;
	}
	
	public boolean agregarCafe(int cafe) {
		if((capacidadMaxima - capacidadActual) < cafe) {
			capacidadActual = capacidadMaxima;
			return false;
		} else {
			capacidadActual = cafe;
			return true;
		}
	}
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + "]";
	}
	
	
}
