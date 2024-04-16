package com.always.segundo;

import java.time.LocalDate;

public class Auto {
	private int gasolina;
	private double velocidad;
	private double consumo;
	private double distancia;
	static final double PI = 3.1415;
	LocalDate fecha = LocalDate.now();
	
	
	public Auto(int gasolina, double velocidad, double consumo) {
		super();
		this.gasolina = gasolina;
		this.velocidad = velocidad;
		this.consumo = consumo;
		distancia = 0;
	}
	
	public boolean avanzar(int gasolina) {
		if(this.gasolina < gasolina) {
			return false;
		} else {
			this.gasolina -= gasolina;
			distancia += gasolina * velocidad / consumo;
			return true;
		}
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		if(distancia < 0) {
			return;
		}
		this.distancia = distancia;
	}

	public int getGasolina() {
		return gasolina;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public double getConsumo() {
		return consumo;
	}

	@Override
	public String toString() {
		return "Auto [gasolina=" + gasolina + ", velocidad=" + velocidad + ", consumo=" + consumo + ", distancia="
				+ distancia + "]";
	}
	
	public static void bocina() {
		System.out.println("HONK HONK!");
	}
	
	
}
