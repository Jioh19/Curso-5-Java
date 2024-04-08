import java.util.ArrayList;

public class Cliente {
	private long id;
	private String nombre;
	private String apellido;
	private String direccion;
	private ArrayList<Cuenta> cuentas;
	
	
	
	
	public Cliente() {
		super();
		cuentas = new ArrayList<>();
	}


	public Cliente(long id, String nombre, String apellido, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		cuentas = new ArrayList<>();
	}






	public long getId() {
		return id;
	}



	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}

	public void actualizarDatos(Cliente cliente) {
		this.nombre = cliente.getNombre();
		this.apellido = cliente.getApellido();
		this.direccion = cliente.getDireccion();
		this.id = cliente.getId();
	}


	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
