package cl.bootcamp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.dao.Dao;
import cl.bootcamp.model.Producto;

public class ProductoService implements RepoService<Producto>{


	@Override
	public int create(Producto p) throws SQLException {
		String insert = String.format(
				"INSERT INTO productos(nombre, precio)"
				+ "VALUES ('%s','%s')", p.getNombre(), p.getPrecio());
		return Dao.actualizarBaseDatos(insert);
	}
	
	private Producto crearProducto(ResultSet rs) throws SQLException {
		return new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getString("precio"));

	}

	@Override
	public List<Producto> getAll() throws SQLException {
		List<Producto> productos = new ArrayList<>();
		String select = "SELECT id, nombre, precio FROM productos";
		try (ResultSet rs = Dao.realizarConsulta(select);) {
			while (rs.next()) {
				Producto cliente = crearProducto(rs);
				productos.add(cliente);
			}

		}
		return productos;
	}

	@Override
	public Producto getOne(int id) throws SQLException {
		Producto producto = null;
		String query = "SELECT id, nombre, precio FROM productos";
		try (ResultSet rs = Dao.realizarConsulta(query);) {
			if(rs.next()) {
				producto = crearProducto(rs);
			}

		}
		return producto;
	}

	@Override
	public int update(Producto p) throws SQLException {
		Producto prod = getOne(p.getId());
		prod.setNombre(p.getNombre() == null? prod.getNombre(): p.getNombre());
		prod.setPrecio(p.getPrecio() == null? prod.getPrecio(): p.getPrecio());
		String update = String.format(
				"UPDATE productos SET nombre='%s', precio='%s' WHERE id='%s'",
				prod.getNombre(), prod.getPrecio(), prod.getId());
		return Dao.actualizarBaseDatos(update);
	}

	@Override
	public int delete(int id) throws SQLException {
		String delete = String.format("DELETE FROM productos WHERE id='%d'", id);
		return Dao.actualizarBaseDatos(delete);
	}
	
	
}
