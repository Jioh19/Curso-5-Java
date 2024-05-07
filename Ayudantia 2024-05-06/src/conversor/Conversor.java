package conversor;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Conversor {

	public static void convertir() {
		Moneda peso = new Moneda("Chilean Peso", 1, "CLP");
		Moneda dolar = new Moneda("American Dollar", 0.001065, "USD");
		Moneda euro = new Moneda("Euro", 0.00098855, "EUR");
		Moneda yen = new Moneda("Japanese Yen", 0.1637, "JPY");
		
		List<Moneda> monedas = new LinkedList<>();
		monedas.add(peso);
		monedas.add(dolar);
		monedas.add(euro);
		monedas.add(yen);
		
//		double monto = 100000;
//		System.out.println("La conversion es: " + 
//				(monto * dolar.getTasa() / peso.getTasa()));
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa moneda base");
			String base = sc.next();
			System.out.println("Ingresa monto");
			double monto = sc.nextDouble();
			System.out.println("Ingresa moneda destino");
			String destino = sc.next();
			
			Moneda monedaBase = null;
			Moneda monedaDestino = null;
			
			for(Moneda m : monedas) {
				if(m.getCodigo().equals(base)) {
					monedaBase = m;
				}
				if(destino.equals(m.getCodigo())) { // a == b , b == a
					monedaDestino = m;
				}
			}
			
			if(monedaBase == null || monedaDestino == null) {
				throw new RuntimeException();
			}
//		var monedaBase = monedas.stream().filter(m -> m.getCodigo().equals(base))
//				.collect(Collectors.toList()).get(0);
//		var monedaDestino = monedas.stream().filter(m -> m.getCodigo().equals(destino))
//				.collect(Collectors.toList()).get(0);
//		
			
			System.out.println(monedaBase);
			System.out.println(monedaDestino);
			System.out.printf("La conversion es: %.2f", 
					(monto * monedaDestino.getTasa() / monedaBase.getTasa()));
		}catch (InputMismatchException e) {
			System.err.println("Ingrese un monto válido");
			convertir();
		}catch (RuntimeException e) {
			System.err.println("Ingrese una moneda válida");
			convertir();
		}catch (Exception e) {
			System.out.println("Error desconocido");
		}
	}

}
