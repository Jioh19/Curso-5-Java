package cl.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.bootcamp.dao.ProductoDao;
import cl.bootcamp.model.Productos;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	private static final Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);
	
	@Autowired
	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public ResponseEntity<List<Productos>> obtener() {
		log.info("Entrando al método ProductServiceImpl.obtener()");
		
		List<Productos> response = new ArrayList<Productos>();
		
		try {
			response = (List<Productos>) ((CrudRepository<Productos, Long>) productoDao).findAll();
		} catch(Exception ex) {
			log.error("Ocurrió un error en ProductServiceImpl.obtener(): " + ex.getMessage());
			return new ResponseEntity<List<Productos>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new  ResponseEntity<List<Productos>>(response, HttpStatus.ACCEPTED);
	}

}
