package sorting;

public class Persona implements Comparable{
	private String nombre;
	private double salario;
	public Persona(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "\nPersona [nombre=" + nombre + ", salario=" + salario + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(salario == ((Persona)o).getSalario()) return 0;
		else if(salario > ((Persona)o).getSalario()) return 1;
		else return -1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
