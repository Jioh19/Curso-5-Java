package cl.alke.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.alke.model.Empleado;

public class EmpleadoDao extends Dao{
	
	public List<Empleado> leer() throws SQLException {
		List<Empleado> empleados = new ArrayList<>();
		String select = "SELECT id, nombre, primerApellido, segundoApellido, email, salario FROM empleados";
		
		realizarConsulta(select);
		
		while(rs.next()) {
			Empleado e = new Empleado();
			e.setId(rs.getInt("id"));
			e.setNombre(rs.getString("nombre"));
			e.setPrimerApellido(rs.getString("primerApellido"));
			e.setSegundoApellido(rs.getString("segundoApellido"));
			e.setEmail(rs.getString("email"));
			e.setSalario(rs.getDouble("salario"));
			empleados.add(e);
		}
		
		return empleados;
	}
}
