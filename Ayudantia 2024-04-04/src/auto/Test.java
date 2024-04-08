package auto;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto tesla = new Auto("Tesla", 0, 100, 123);
		Auto mercedes = new Auto("Mercedes", 0, 90, 222);
		Auto vw = new Auto("Volkswagen", 0, 110, 545);
		
		ArrayList<Auto> autos = new ArrayList<>();
		
		autos.add(mercedes);
		autos.add(tesla);
		autos.add(vw);
		
		for(Auto auto : autos) {
			auto.cargar(100);
			System.out.println(auto);
		}
		
		for(Auto auto : autos) {
			auto.avanzar(50);
			System.out.println(auto);
		}
		
		for(Auto auto : autos) {
			System.out.printf("El auto %s puede avanzar hasta %f\n",auto.getNombre(), auto.maxDist());
		}
		
		/*System.out.println(tesla + "\n" + mercedes);
		tesla.cargar(100);
		mercedes.cargar(50);
		System.out.println(tesla + "\n" + mercedes);
		tesla.avanzar(69);
		
		System.out.println(tesla.getBateria());
		System.out.println(tesla + "\n" + mercedes);
		System.out.println("El auto puede avanzar hasta " + tesla.maxDist());
		System.out.println("El auto puede avanzar hasta " + mercedes.maxDist());
*/
	}

}
