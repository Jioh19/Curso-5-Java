package cl.bootcamp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

	private static Connection conex = null;

	private static final String SCHEMA = "tiendaE";
	private static final String BD = "jdbc:mysql://localhost/" + SCHEMA;
	private static final String USER = "root";
	private static final String PASS = "1160";
	private static ResultSet rs = null;
	private static Statement stmt;
	

	public static Connection conexion() {
		try {
			if (conex == null) {
				conex = DriverManager.getConnection(BD, USER, PASS);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conex;
	}

	public static void realizarConsulta(String consulta) {

		try {
			conex = conexion();
			stmt = conex.createStatement();
			rs = stmt.executeQuery(consulta);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static int actualizarBaseDatos(String consulta) {
		int resultado = 0;
		try {
			conex = conexion();
			stmt = conex.createStatement();
			resultado = stmt.executeUpdate(consulta);

		} catch (SQLException sql) {
			System.out.println("Error al actualizar en base de datos");
			System.out.println(sql.getMessage());
		}

		return resultado;
	}

}
