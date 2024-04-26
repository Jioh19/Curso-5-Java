package com.always.observador;

public interface SujetoObservador {
	
	void notificar(String mensaje);
	int getCantidadDeNotificacion();
	String getNombre();
}
