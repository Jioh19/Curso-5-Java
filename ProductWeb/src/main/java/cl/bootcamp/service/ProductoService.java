package cl.bootcamp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.dao.ProductoDao;
import cl.bootcamp.model.Producto;

public class ProductoService {
	
	private ProductoDao dao;
	
	public ProductoService() {
		this.dao = new ProductoDao();
	}
	
	public int insertarProducto(Producto producto) {	
		int resultado = this.dao.insertar(producto);
		return resultado;
	}
	
	public List<Producto> obtenerProductos() throws SQLException{
		List<Producto> listProd = new ArrayList<>();
		listProd = this.dao.consultar();
		return listProd;
	}
	
	public int eliminarProducto(int id) {
		int resultado = this.dao.eliminar(id);
		return resultado;
	}
	
	
	
	
	
	

}
