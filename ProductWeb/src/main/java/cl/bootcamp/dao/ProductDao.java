package cl.bootcamp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.model.Producto;

public class ProductDao extends Dao implements Crud<Producto>{

  @Override
  public int create(Producto p) throws SQLException {
    String insert = String.format("INSERT INTO productos(nombre, precio)" +
    "VALUES ('%s', '%s')", p.getNombre(), p.getPrecio());
    return actualizarBaseDatos(insert);
  }

  @Override
  public List<Producto> getAll() throws SQLException {
    List<Producto> productos = new ArrayList<>();
    String select = "SELECT id, nombre, precio FROM productos";
    try (realizarConsulta(select);) {
      while (rs.next) {
        
      }
    }
    
  }

  @Override
  public Producto getOne(int id) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOne'");
  }

  @Override
  public int update(Producto p) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public int delete(int id) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
  
}
