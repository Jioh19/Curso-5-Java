package repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import model.Cliente;

public class ClienteRepositorio implements Repositorio<Cliente> {

	Dao dao = new Dao();

	@Override
	public int create(Cliente c) throws SQLException {
		String stInsert = "INSERT INTO cliente(nombre, apellido, email, password) " + String.format(
				"VALUES ('%s', '%s', '%s', '%s')", c.getNombre(), c.getApellido(), c.getEmail(), c.getPassword());

		int insert = Dao.actualizarBaseDatos(stInsert);

		return insert;

	}

	private Cliente crearEmpleado(ResultSet rs) throws SQLException {
		return new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("email"),
				rs.getString("password"));

	}

	@Override
	public List<Cliente> getAll() throws SQLException {
		List<Cliente> clientes = new ArrayList<>();
		String query = "SELECT id, nombre, apellido, email, password FROM cliente";
		try (ResultSet rs = Dao.realizarConsulta(query);) {
			while (rs.next()) {
				Cliente cliente = crearEmpleado(rs);
				clientes.add(cliente);
			}

		}
		return clientes;
	}

	@Override
	public Cliente getId(int id) throws SQLException {
		String query = "SELECT id, nombre, apellido, email, password FROM cliente WHERE id=" + id;
		Cliente cliente = null;
		try (ResultSet rs = Dao.realizarConsulta(query);) {
			if (rs.next()) {
				cliente = crearEmpleado(rs);
			} else {
				throw new SQLException("Cliente no encontrado");
			}

		}
		return cliente;
	}

	@Override
	public void update(Cliente t) throws SQLException {
		Cliente c = getId(t.getId());
		c.setNombre(t.getNombre() == null ? c.getNombre() : t.getNombre());
		c.setApellido(t.getApellido() == null ? c.getApellido() : t.getApellido());
		c.setEmail(t.getEmail() == null ? c.getEmail() : t.getEmail());
		c.setPassword(t.getPassword() == null ? c.getPassword() : t.getPassword());

		String stInsert = String.format(
				"UPDATE cliente SET nombre='%s', apellido='%s', " + "email='%s', password='%s' WHERE id='%d'",
				c.getNombre(), c.getApellido(), c.getEmail(), c.getPassword(), c.getId());
		System.out.println(stInsert);
		Dao.actualizarBaseDatos(stInsert);

	}

	@Override
	public void delete(int id) throws SQLException {
		String stDelete = String.format("DELETE FROM cliente WHERE id='%d'", id);
		Dao.actualizarBaseDatos(stDelete);

	}

}
