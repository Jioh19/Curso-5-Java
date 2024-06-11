package cl.bootcamp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import cl.bootcamp.model.Productos;

public interface IProductoService {
	
	public ResponseEntity<List<Productos>> obtener();

}
