package empleados;

public class Main {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado(50000);
		Empleado emp2 = new Empleado(70000);
		Empleado emp3 = new Empleado(90000);
		
		Jefe jefe = new Jefe(emp1, emp2, emp3);
		
		emp1.trabajar();
		jefe.trabajar();

	}

}
