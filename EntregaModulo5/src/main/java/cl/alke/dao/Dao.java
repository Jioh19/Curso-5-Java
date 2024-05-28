package cl.alke.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	
	private static final String BBDD ="jdbc:mysql://localhost/tiendaE";
	private static final String USER ="root";
	private static final String PASS ="1160";
	
	private static Connection conex = null;
	protected static ResultSet rs = null;
	private static Statement stmt = null;
	
	public static Connection conexion() {
				
		try {
			
			if( conex == null) {
				conex = DriverManager.getConnection(BBDD, USER, PASS );
			}
				
		} catch ( Exception e) {
			System.out.println("Error al conectarse a la base de datos");
		}
		
		return conex;
		
	}
	
	public static void cerrarConexion(Connection conex) {
		try {
			conex.close();
		} catch ( SQLException sql) {
			System.out.println("error al cerrar la conexión");
		}
	}
	
	public static void realizarConsulta(String consulta) {
		
		try {
			conex = conexion();
			
			Statement stmt = conex.createStatement();
			rs = stmt.executeQuery(consulta);
			
		} catch (SQLException sql) {
			System.out.println("Error al realizar la consulta: "+sql.getMessage());
		}
		
	}
	
	public static int actualizarBaseDatos(String consulta) {
		int resultado= 0;
		try {
			
			conex = conexion();
			
			stmt = conex.createStatement();
			resultado = stmt.executeUpdate(consulta);
			
			
		} catch (SQLException sql) {
			System.out.println("Error al actualizar en base de datos");
		}
		
		return resultado;
	}

}
