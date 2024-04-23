package Super;

import java.util.ArrayList;

public class Carrito {
	private Estado estadoActual;
	private ArrayList<Producto> productos;
	
	public Carrito() {
		productos = new ArrayList<>();
		estadoActual = new Vacio();
	}
	
	public void agregar(Producto producto) {
		try {
			estadoActual.agregar();
			if(estadoActual instanceof Vacio) {
				productos.add(producto);
				estadoActual = new Cargando();
			} else if(estadoActual instanceof Cargando) {
				productos.add(producto);
			}
		} catch(CarritoException exception) {
			System.err.println(exception.getMessage());
		}
	}
	
	public void cancelar() {
		try {
			estadoActual.cancelar();
			if(estadoActual instanceof Cargando || estadoActual instanceof Pagando) {
				productos.clear();
				estadoActual = new Vacio();
			} 
		} catch(CarritoException exception) {
			System.err.println(exception.getMessage());
		}
	}
	
	public void volver() {
		try {
			estadoActual.volver();
			if(estadoActual instanceof Cargando) {
				productos.clear();
				estadoActual = new Vacio();
			} else if(estadoActual instanceof Pagando) {
				estadoActual = new Cargando();
			}
		} catch(CarritoException exception) {
			System.err.println(exception.getMessage());
		}
	}
	
	public void siguiente() {
		try {
			estadoActual.siguiente();
			if(estadoActual instanceof Cargando) {
				estadoActual = new Pagando();
			}else if(estadoActual instanceof Pagando) {
				estadoActual = new Cerrando();
			} else if(estadoActual instanceof Cerrando) {
				productos.clear();
				estadoActual = new Vacio();
			}
		} catch(CarritoException exception) {
			System.err.println(exception.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Carrito [estadoActual=" + estadoActual + ", productos=" + productos + "]";
	}
	
}
