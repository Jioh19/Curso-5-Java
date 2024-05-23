package cl.bootcamp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.model.Producto;

public class ProductoDao extends Dao{
	
	public int insertar(Producto producto) {
		
		String stInsert = "INSERT INTO products(nombre, precio VALUES('"
							+producto.getNombre()+"', '"+producto.getPrecio()+"')";
		
		int insert = actualizarBaseDatos(stInsert);
		
		return insert;
	}
	
	public List<Producto> consultar() throws SQLException {
		
		List<Producto> listProd = new ArrayList<>();
		String query = "SELECT id, nombre, precio FROM products";
		
		realizarConsulta(query);
		
		while(rs.next()) {
			Producto prod = new Producto();
			prod.setId(rs.getInt("id"));
			prod.setNombre(rs.getString("nombre"));
			prod.setPrecio(rs.getString("precio"));
			
			listProd.add(prod);
		}
		
		return listProd;	
		
	}
	
	public int eliminar(int id) {
		String stDelete = "DELETE FROM products WHERE id = "+id;
		int delete = actualizarBaseDatos(stDelete);
		return delete;
	}
	
	
	
	
	

}
