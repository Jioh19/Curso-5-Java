package vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Vehiculo auto = new Vehiculo();
//		Vehiculo auto2 = new VehiculoAveriado();
//		
//		auto.avanzar();
//		auto2.avanzar();
		
		Vehiculo tanke = new VehiculoBelico();
		Vehiculo jet = new VehiculoAereo();
		Vehiculo tanqueta = new VehiculoBelico();
		Vehiculo helicoptero = new VehiculoAereo();
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(tanke);
		vehiculos.add(jet);
		vehiculos.add(helicoptero);
		vehiculos.add(tanqueta);
		
		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo instanceof VehiculoBelico) {
				((VehiculoBelico)vehiculo).disparar();
			} else if(vehiculo instanceof VehiculoAereo) {
				((VehiculoAereo)vehiculo).volar();
			}
		}
	}

}
