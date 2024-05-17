package cl.bootcamp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SCHEMA = "tiendaE";
	private static final String BD = "jdbc:mysql://localhost/" + SCHEMA;
	private static final String USER = "root";
	private static final String PASS = "1160";
	private static ResultSet rs = null;
	private static Statement stmt;
	
	private static Connection conex = null;

	public static Connection conexion() {
		try {
			if (conex == null) {
				Class.forName(DRIVER);
				System.out.println("Entro al metodo conexion! 2");
				conex = DriverManager.getConnection(BD, USER, PASS);
				System.out.println("Generó la conexion!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conex;
	}

	public static void main(String[] args) {
		conex = conexion();
		if(conex != null) {
			System.out.println("Conexion exitosa");
		} else {
			System.out.println("Conexion fallida");
		}
	}
	
	public static void cerrarConexion() {
		try {
			conex.close();
		} catch (SQLException sql) {
			System.out.println("Error al cerrar la conexión");
		}
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
