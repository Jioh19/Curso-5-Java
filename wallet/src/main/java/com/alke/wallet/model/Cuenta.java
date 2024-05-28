package com.alke.wallet.model;

public class Cuenta {
	
	private String nombreUsuario;
	private Integer nombreCuenta;
	private double saldoActual;
	private String verDatos;
	
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Integer getNombreCuenta() {
		return nombreCuenta;
	}
	public void setNombreCuenta(Integer nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	public double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	public String getVerDatos() {
		return verDatos;
	}
	public void setVerDatos(String verDatos) {
		this.verDatos = verDatos;
	}
	
	
}
