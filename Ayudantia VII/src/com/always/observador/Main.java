package com.always.observador;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Clarivel");
		Seguidor seguidor1 = new Seguidor("Gabriel");
		Seguidor seguidor2 = new Seguidor("Benjamín");
		Seguidor seguidor3 = new Seguidor("Juan");
		
		usuario.agregarSeguidor(seguidor1);
		usuario.agregarSeguidor(seguidor2);
		usuario.agregarSeguidor(seguidor3);
		
		usuario.subirFoto();
		usuario.subirFoto();
		System.out.println("Cantidad de notificaciones para el usuario" + seguidor1.getNombre() + " " + seguidor1.getCantidadDeNotificacion());

	}

}
