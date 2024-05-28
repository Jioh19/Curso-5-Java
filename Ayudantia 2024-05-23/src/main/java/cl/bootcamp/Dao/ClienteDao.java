package cl.bootcamp.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.bootcamp.modelo.Cliente;
import cl.bootcamp.modelo.Producto;

public class ClienteDao extends Dao implements Crud<Cliente>{

	@Override
	public int crear(Cliente c) throws SQLException {
		String insert = String.format("INSERT INTO empleados (nombre, primerApellido, segundoApellido, email, salario)" +
				"VALUES ('%s', '%s', '%s', '%s', '%s')", 
				c.getNombre(), c.getPrimerApellido(), c.getSegundoApellido(), c.getEmail(), c.getSalario());
		return actualizarBaseDatos(insert); 
	}

	
	@Override
	public List<Cliente> leer() throws SQLException {
		List<Cliente> productos = new ArrayList<>();
		
		String select = "SELECT id, nombre, primerApellido, segundoApellido, email, salario FROM empleados";
		realizarConsulta(select);
		
		while(rs.next()) {
			Cliente c = new Cliente();
			c.setId(rs.getString("id"));
			c.setNombre(rs.getString("nombre"));
			c.setPrimerApellido(rs.getString("primerApellido"));
			c.setSegundoApellido(rs.getString("segundoApellido"));
			c.setEmail(rs.getString("email"));
			c.setSalario(rs.getString("salario"));
			productos.add(c);
		}
		return productos;
	}

	@Override
	public Cliente leerUno(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int actualizar(Cliente t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		var dao = new ClienteDao();
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
		
		Cliente cliente= new Cliente("Juan", "Oh", "Kim", "juan@mail.com", "1500");
		try {
			var resultado = dao.crear(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
