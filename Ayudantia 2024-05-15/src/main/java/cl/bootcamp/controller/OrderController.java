package cl.bootcamp.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.config.ConexionDB;
import cl.bootcamp.model.Cliente;
import cl.bootcamp.model.Order;

public class OrderController {
	public static List<Order> getOrder(Connection conex) {


		String consulta = "SELECT customerNumber, productCode, quantityOrdered, orderDate FROM orders, orderdetails";
		String customerNumber, productCode, quantity, date;
		List<Order> orders = new ArrayList<>();

		try (ResultSet res = ConexionDB.realizarConsulta(consulta);) {
			while (res.next()) {
				customerNumber = res.getString(1);
				productCode = res.getString(2);
				quantity = res.getString(3);
				date = res.getString(4);

				orders.add(new Order(customerNumber, productCode, quantity, date));
				// System.out.printf("%s %s %s %s\n", customerNumber, customerName, country,
				// city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orders;
	}
}
