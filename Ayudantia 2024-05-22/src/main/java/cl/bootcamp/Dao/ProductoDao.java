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
//		String insert = "INSERT INTO products (nombre, precio) VALUES ('"
//				+usuario.getNombre()+"', '"+usuario.getSaldo()+"')";
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
	public int actualizar(Producto t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		var dao = new ProductoDao();
		var conex = conexion();
		if(conex == null) {
			System.out.println("Conexion fallida");
		} else {
			System.out.println("Conexion exitosa");
		}
		
		try {
			var productos = dao.leer();
			System.out.println(productos);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
