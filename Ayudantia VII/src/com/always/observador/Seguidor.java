package com.always.observador;

public class Seguidor implements SujetoObservador{
	private String nombre;
	private int cantidadDeNotificaciones = 0;
	
	public Seguidor(String nombre) {
		super();
		this.nombre = nombre;
		
	}

	@Override
	public void notificar(String mensaje) {
		System.out.println(nombre + " recibió una notificación: " + mensaje);
		cantidadDeNotificaciones++;
		
	}

	@Override
	public int getCantidadDeNotificacion() {
		// TODO Auto-generated method stub
		return cantidadDeNotificaciones;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
