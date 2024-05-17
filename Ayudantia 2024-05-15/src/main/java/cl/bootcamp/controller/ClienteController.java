package cl.bootcamp.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cl.bootcamp.config.ConexionDB;
import cl.bootcamp.model.Cliente;
import cl.bootcamp.model.Order;
import cl.bootcamp.model.Product;

public class ClienteController {

	public static List<Cliente> getCliente(Connection conex) {

		String consulta = "SELECT customerNumber, customerName, country, city FROM customers";
		String customerNumber, customerName, country, city;
		List<Cliente> clientes = new ArrayList<>();

		try (ResultSet res = ConexionDB.realizarConsulta(consulta);) {
			while (res.next()) {
				customerNumber = res.getString(1);
				customerName = res.getString(2);
				country = res.getString(3);
				city = res.getString(4);

				clientes.add(new Cliente(customerNumber, customerName, country, city));
				// System.out.printf("%s %s %s %s\n", customerNumber, customerName, country,
				// city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clientes;
	}

	public static void getCompra(Cliente cliente, List<Order> orders, List<Product> products) {
		String customer = cliente.customerNumber();
		System.out.println(customer);
		List<Order> ordenesSeleccionadas = orders.stream().filter(order -> order.customerNumber().equals(customer))
				.toList();

		for (Order o : ordenesSeleccionadas) {
			
			Map<String, Product> mp = new HashMap<>();
			mp.put(o.productCode(), products.stream().filter(product -> product.productCode().equals(o.productCode()).toList().get(0)));
		}


	}
}