package cl.bootcamp.model;

public class Producto {
	
	private int id;
	private String nombre;
	private String precio;
	
	
	public Producto(int id, String nombre, String precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public Producto(String nombre, String precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	
	public Producto() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	

	
}
