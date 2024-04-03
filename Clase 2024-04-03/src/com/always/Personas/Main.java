package com.always.Personas;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> muchasPersonas = new ArrayList<>();
		
		Persona personas[] = new Persona[3];
 		Persona juan = new Persona("Juan Oh", 27, "Hola soy Juan");
		Persona elena = new Persona("Elena", 25, "Hola soy la profe");
		Persona juans = new Persona("Juan Silva", 22, "Soy Juan silencioso");
		
		personas[0] = juan;
		personas[1] = elena;
		personas[2] = juans;
		
		/*for(Persona persona : personas) {
			System.out.println(persona);
		}
		
		for(int i = 0; i <personas.length; i++) {
			System.out.println(personas[i]);
		}
		
		int i = 0;
		while(i < personas.length) {
			System.out.println(personas[i]);
			i++;
		}*/
		
		muchasPersonas.add(juan);
		muchasPersonas.add(elena);
		muchasPersonas.add(juans);
		
		for(Persona persona : muchasPersonas) {
			System.out.println(persona);
		}
		Stream.of(muchasPersonas);
	}

}
