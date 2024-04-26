package empleados;

public class Jefe extends Empleado{
//	Empleado emp1;
//	Empleado emp2;
//	Empleado emp3;
	
	Empleado[] empleados = new Empleado[3];

	public Jefe(Empleado emp1, Empleado emp2, Empleado emp3) {
		super(0);
		empleados[0] = emp1;
		empleados[1] = emp2;
		empleados[2] = emp3;
	}

	@Override
	public void trabajar() {
		System.out.println("Vayan a trabajar");
		for(Empleado emp : empleados) {
			emp.trabajar();
		}
	}
	
	
	
}
