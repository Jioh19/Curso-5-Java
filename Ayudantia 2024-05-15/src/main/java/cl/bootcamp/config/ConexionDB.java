package cl.bootcamp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.model.Cliente;

public class ConexionDB {

	private static Connection conex = null;

	private static final String SCHEMA = "classicmodels";
	private static final String BD = "jdbc:mysql://localhost/" + SCHEMA;
	private static final String USER = "root";
	private static final String PASS = "1160";

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

	public static ResultSet realizarConsulta(String consulta) {
		ResultSet rs = null;

		try {
			conex = conexion();
			Statement stmt = conex.createStatement();
			rs = stmt.executeQuery(consulta);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return rs;
	}

}
