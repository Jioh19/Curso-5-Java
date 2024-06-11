package cl.bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cl.bootcamp.model.Album;
import cl.bootcamp.model.Productos;
import cl.bootcamp.service.IProductoService;

@RestController
@RequestMapping("/v1")
public class ProductoController {

	@Autowired
	private IProductoService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/producto")
	public ResponseEntity<List<Productos>> obtenerProductos() {
		
		ResponseEntity<List<Productos>> response = service.obtener();
		return response;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Album>> obtenerAlbums() {
		
		List<Album> response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/albums", List.class);
		
		return new ResponseEntity<List<Album>>(response, HttpStatus.OK);
	}
}
