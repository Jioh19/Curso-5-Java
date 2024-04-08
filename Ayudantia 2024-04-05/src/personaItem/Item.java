package personaItem;

public class Item {
	private String nombre;
	private int peso;
	private int volumen;
	
	public Item(String nombre, int peso, int volumen) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.volumen = volumen;
	}
	@Override
	public String toString() {
		return "\nItem [nombre=" + nombre + ", peso=" + peso + ", volumen=" + volumen + "]";
	}
	public String getNombre() {
		return nombre;
	}

	public int getPeso() {
		return peso;
	}

	public int getVolumen() {
		return volumen;
	}

	
}
