package cl.alke.model;

public class Producto {
	private int sucursal;
	private int id;
	private String nombre;
	private int stock;
	
	public Producto(int sucursal, int id, String nombre, int stock) {
		super();
		this.sucursal = sucursal;
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
	}
	
	
	public int getSucursal() {
		return sucursal;
	}


	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
