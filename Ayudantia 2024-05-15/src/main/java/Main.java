import java.sql.Connection;
import java.util.List;

import cl.bootcamp.config.ConexionDB;
import cl.bootcamp.controller.ClienteController;
import cl.bootcamp.controller.OrderController;
import cl.bootcamp.controller.ProductoController;
import cl.bootcamp.model.Cliente;
import cl.bootcamp.model.Order;
import cl.bootcamp.model.Product;

public class Main {
	public static void main(String[] args) {

		Connection conex = ConexionDB.conexion();
		List<Product> productos = ProductoController.getProducto(conex);


		List<Cliente> clientes = ClienteController.getCliente(conex);


		List<Order> orders = OrderController.getOrder(conex);

		Cliente cliente = clientes.get(0);
		
		System.out.println(cliente);
		
		ClienteController.getCompra(cliente, orders, productos);

		
	}
}
