package cl.bootcamp.dao;

import cl.bootcamp.model.Producto;

public class ProductoDao extends Dao{

	public int insertar(Producto producto) {
		
		String stInsert = "INSERT INTO products(nombre, precio) VALUES('"
				+producto.getNombre()+ "', '" +producto.getPrecio()+"')";

		int insert = actualizarBaseDatos(stInsert);
		
		return insert;
	}
}
