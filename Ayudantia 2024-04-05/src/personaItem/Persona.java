package personaItem;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int hp;
	private int carga;
	private int volumen;
	private ArrayList<Item> inventario;
	
	public Persona(String nombre, int hp, int carga, int volumen) {
		super();
		this.nombre = nombre;
		this.hp = hp;
		this.inventario = new ArrayList<>();
		this.carga = carga;
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", hp=" + hp + ", carga=" + carga + ", volumen=" + volumen
				+ ", inventario=" + inventario + "\n]";
	}

	public boolean agregarItem(Item item) {
		if(checkPesoItem(item) && checkVolumenItem(item)) {
			inventario.add(item);
			return true;			
		}
		System.out.println("Tu personaje tiene demasiado peso o mucho volumen");
		return false;
	}
	
	public int getPesoTotal() {
		int total = 0;
		for(Item item : inventario) {
			total += item.getPeso();
		}
		return total;
	}
	
	public int getVolumenTotal() {
		int total = 0;
		for(Item item : inventario) {
			total += item.getVolumen();
		}
		return total;
	}
	
	public boolean checkPesoItem(Item item) {
		if(carga < (getPesoTotal() + item.getPeso())) {
			return false;
		}
		return true;
	}
	
	public boolean checkVolumenItem(Item item) {
		if(volumen < (getVolumenTotal() + item.getVolumen())) {
			return false;
		}
		return true;
	}
}
