package vehiculo;

public class VehiculoAveriado extends Vehiculo{

	@Override
	public void avanzar() {
		System.out.println("Vehiculo averiado, no puede avanzar");
	}
	
}
