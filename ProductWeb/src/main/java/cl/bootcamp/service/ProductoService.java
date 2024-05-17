package cl.bootcamp.service;

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
}
