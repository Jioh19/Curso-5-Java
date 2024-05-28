package cl.bootcamp.modelo;

public class Producto {
	private String id;
	private String nombre;
	private String precio;
	
	public Producto() {
		super();
	}
	
	
	public Producto(String nombre, String precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]\n";
	}
	
	
}
