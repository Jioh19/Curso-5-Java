package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private int id;
	private String password;
	List<Cuenta> cuentas;
	
	public Cliente(String nombre, int id, String password) {
		super();
		this.cuentas = new ArrayList<>();
		this.nombre = nombre;
		this.id = id;
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", id=" + id + ", password=" + password + ", cuentas=" + cuentas + "]";
	}
	
	
}
