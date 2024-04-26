package empleados;

public class Empleado {
	private double salario;
	
	
	public Empleado(double salario) {
		super();
		this.salario = salario;
	}
	
	public void trabajar() {
		System.out.println("Estoy trabajando! por " +salario);
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
