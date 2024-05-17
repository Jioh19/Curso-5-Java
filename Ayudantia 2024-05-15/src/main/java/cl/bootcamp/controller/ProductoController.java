package cl.bootcamp.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.config.ConexionDB;
import cl.bootcamp.model.Product;

public class ProductoController {
	public static List<Product> getProducto(Connection conex) {



		String consulta = "SELECT productCode, productName, productDescription, MSRP FROM products";
		String productCode, productName, productDescription, msrp;
		List<Product> productos = new ArrayList<>();

		try (ResultSet res = ConexionDB.realizarConsulta(consulta);) {
			while (res.next()) {
				productCode = res.getString(1);
				productName = res.getString(2);
				productDescription = res.getString(3);
				msrp = res.getString(4);

				productos.add(new Product(productCode, productName, productDescription, msrp));
				// System.out.printf("%s %s %s %s\n", customerNumber, customerName, country,
				// city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return productos;
	}
}
