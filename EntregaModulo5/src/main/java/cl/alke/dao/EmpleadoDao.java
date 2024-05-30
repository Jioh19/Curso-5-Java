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
	
	public int crear(Empleado e) throws SQLException {
		String insert = "INSERT INTO empleados (nombre, primerApellido, segundoApellido, email, salario) VALUES"
				+ String.format("('%s', '%s', '%s', '%s', '%f')", 
						e.getNombre(), e.getPrimerApellido(), e.getSegundoApellido(), e.getEmail(), e.getSalario());
		return actualizarBaseDatos(insert);
	}
	
//	public static void main(String[] args) {
//		EmpleadoDao emple = new EmpleadoDao();
//		Empleado e = new Empleado("Natalia", "Peña", "Diaz", "natalia@mail.com", 69420.0);
//		try {
//			System.out.println(emple.crear(e));
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	}
	
}
