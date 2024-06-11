package cl.bootcamp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cl.bootcamp.model.Productos;

public interface ProductoDao extends CrudRepository<Productos, Long>{

}
