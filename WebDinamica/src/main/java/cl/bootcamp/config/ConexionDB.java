package cl.bootcamp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

	private static final String BBDD = "jdbc:mysql://localhost/tiendaE";
	private static final String USER = "root";
	private static final String PASS = "1160";

	private static Connection conex = null;

	public static Connection conexion() {

		try {

			if (conex == null) {
				conex = DriverManager.getConnection(BBDD, USER, PASS);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return conex;

	}

	public static void cerrarConexion(Connection conex) {
		try {
			conex.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static ResultSet realizarConsulta(String consulta) {

		ResultSet rs = null;
		try {
			conex = conexion();
			Statement stmt = conex.createStatement();
			rs = stmt.executeQuery(consulta);
		} catch (SQLException sql) {
			System.out.println("Error al realizar la consulta: " + sql.getMessage());
		}

		return rs;
	}

	public static int actualizarBaseDatos(String consulta) {
		int resultado = 0;
		try {
			conex = conexion();
			Statement stmt = conex.createStatement();
			resultado = stmt.executeUpdate(consulta);

		} catch (SQLException sql) {
			System.out.println("Error al actualizar en base de datos");
			System.out.println(sql.getMessage());
		}

		return resultado;
	}

	public static void main(String[] args) throws SQLException {
		Connection conex = null;
		ResultSet datos = null;

		conex = conexion();

		if (conex == null) {
			System.out.println("Problemas con la conexion");
		} else {
			System.out.println("Conexion exitosa");
		}

		String consulta = "SELECT id, nombre, primerApellido, segundoApellido, email FROM empleados";
		datos = realizarConsulta(consulta);

		String nombre, primerApellido, segundoApellido, email;
		int id;

		while (datos.next()) {
			nombre = datos.getString("nombre");
			id = datos.getInt(1);
			primerApellido = datos.getString(3);
			segundoApellido = datos.getString(4);
			email = datos.getString(5);

			System.out.printf("%d %s %s %s %s\n", id, nombre, primerApellido, segundoApellido, email);
		}

		String stCreate = "CREATE TABLE cuenta (" + "id INT AUTO_INCREMENT," + "saldo VARCHAR(50) NOT NULL,"
				+ "fecha VARCHAR(50) NOT NULL," + "PRIMARY KEY(id)" + ")";

		int create = actualizarBaseDatos(stCreate);

		if (create == 0) {
			System.out.println("Tabla creada exitosamente");
		}

		String stInsert = "INSERT INTO cuenta(saldo, fecha) VALUES('23000', '15/05/24')";

		create = actualizarBaseDatos(stInsert);

		if (create == 0) {
			System.out.println("Tabla creada exitosamente");
		}
		cerrarConexion(conex);
	}
}
