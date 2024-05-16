package cl.bootcamp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.model.Cliente;
import cl.bootcamp.view.SwingApp;

public class ConexionDB {
	
	private static Connection conex = null;
	
	private static final String SCHEMA = "classicmodels";
	private static final String BD = "jdbc:mysql://localhost/" + SCHEMA ;
	private static final String USER = "root";
	private static final String PASS = "1160";
	
	public static Connection conexion() {
		try {
			if(conex == null) {
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
			rs= stmt.executeQuery(consulta);
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
		
		return rs;
	}
	public static void main(String[] args ) {
		
		SwingApp swingApp = new SwingApp();
		swingApp.setVisible(true);
		conex = conexion();
	
		
		if(conex == null) {
			System.out.println("Conexion fallida");
		} else {
			System.out.println("Conexion exitosa");
		}
		
		String consulta2 = "select * from orders o\n"
				+ "inner join orderdetails od\n"
				+ "on o.orderNumber = od.orderNumber";
		String consulta = "SELECT customerNumber, customerName, country, city FROM customers";
		String customerNumber, customerName, country, city;
		List<Cliente> clientes = new ArrayList<>();
		try(
				ResultSet res = realizarConsulta(consulta2);				
				) {
			while(res.next()) {
				customerNumber = res.getString(1);
				customerName = res.getString(2);
				country = res.getString(3);
				city = res.getString(4);
				
				clientes.add(new Cliente(customerNumber, customerName, country, city));
				//System.out.printf("%s %s %s %s\n", customerNumber, customerName, country, city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clientes.sort(null);
		
		for(Cliente c: clientes) {
			System.out.println(c);
		}

		
		
	}
}

