package cl.alke.service;

import java.sql.SQLException;
import java.util.List;

import cl.alke.dao.EmpleadoDao;
import cl.alke.model.Empleado;

public class EmpleadoService {
	private EmpleadoDao dao = new EmpleadoDao();
	
	public List<Empleado> readAll() {
		List<Empleado> empleados = null;
		try {
			empleados = dao.leer();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
	}
	
	public static void main(String[] args) {
		EmpleadoService e = new EmpleadoService();
		System.out.println(e.readAll());
	}
}
