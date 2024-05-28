package cl.bootcamp.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.modelo.Producto;

public class ProductoDao extends Dao implements Crud<Producto>{

	@Override
	public int crear(Producto p) throws SQLException {
		String insert = String.format("INSERT INTO productos (nombre, precio)" +
				"VALUES ('%s', '%s')", p.getNombre(), p.getPrecio());
		return actualizarBaseDatos(insert); 
	}

	@Override
	public List<Producto> leer() throws SQLException {
		List<Producto> productos = new ArrayList<>();
		
		String select = "SELECT id, nombre, precio FROM productos";
		realizarConsulta(select);
		
		while(rs.next()) {
			Producto p = new Producto();
			p.setId(rs.getString("id"));
			p.setNombre(rs.getString("nombre"));
			p.setPrecio(rs.getString("precio"));
			productos.add(p);
		}
		return productos;
	}

	@Override
	public Producto leerUno(int id) throws SQLException {
		String select = String.format("SELECT id, nombre, precio FROM productos WHERE id =%s", id);
		realizarConsulta(select);
		Producto p = new Producto();
		if(rs.next()) {
			p.setId(rs.getString("id"));
			p.setNombre(rs.getString("nombre"));
			p.setPrecio(rs.getString("precio"));
		} else {
			throw new SQLException("Id not found");
		}
		return p;
	}

	@Override
	public int actualizar(Producto p) throws SQLException {
		String update = String.format("UPDATE productos SET nombre='%s', precio='%s' WHERE"
				+ "id='%s'", p.getNombre(), p.getPrecio(), p.getId());
		return Dao.actualizarBaseDatos(update);
	}

	@Override
	public int eliminar(int id) throws SQLException {
		String delete = "DELETE FROM productos WHERE id=" + id;
		return Dao.actualizarBaseDatos(delete);
	}

	

}
