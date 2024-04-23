package Super;



public class Producto {
	private String descripcion;
	private int precio;
	
	public Producto(String descripcion, int precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "\nProducto [descripcion=" + descripcion + ", precio=" + precio + "]";
	}

	
	
}
