package sorting;

import java.util.LinkedList;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<Persona> lista = new LinkedList<>();
		lista.add(new Persona("Juan", 69420));
		lista.add(new Persona("Clarivel", 5000000));
		lista.add(new Persona("Claudia", 4500000));
		lista.add(new Persona("Gabriel", 80000));
		lista.add(new Persona("Juan Silva", 120000));
		
		System.out.println(lista);
		
		lista.sort(null);
		//Collections.sort(lista);
		
		System.out.println(lista);
	}
}
