package com.alke.wallet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreUsuario;
	private Integer nombreCuenta;
	private double saldoActual;
	private String verDatos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
