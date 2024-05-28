package com.alke.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDb {

	private static final String BBDD = "jdbc:mysql://localhost/alkebanco";
	private static final String USER = "root";
	private static final String PASS = "1160";
	private static Connection conex = null;
	protected static ResultSet rs = null;
	private static Statement stmt = null;

	public static Connection conexion() {

		try {

			if (conex == null) {
				conex = DriverManager.getConnection(BBDD, USER, PASS);
			}

		} catch (Exception e) {
			System.out.println("Error al conectarse a la base de datos");
		}

		return conex;

	}
}
