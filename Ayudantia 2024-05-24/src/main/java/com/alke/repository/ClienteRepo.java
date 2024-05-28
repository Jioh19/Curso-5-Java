package com.alke.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.alke.model.Cliente;
import com.alke.util.ConexionDb;

public class ClienteRepo implements Repository<Cliente>{
	
	private Connection obtenerConexion() throws SQLException {
        return ConexionDb.conexion();
    }

	@Override
	public void crear(Cliente c) throws SQLException {
		String sql = "INSERT INTO cliente (nombre, apellido, rut) VALUES (?, ?, ?)";
		
		Connection conexion = obtenerConexion();
		PreparedStatement pS = conexion.prepareStatement(sql);
		pS.setString(1, c.getNombre());
		pS.setString(2, c.getApellido());
		pS.setString(3, c.getRut());
		
		pS.execute();
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Clarivel", "Jeldres", "123456789");
		ClienteRepo repo = new ClienteRepo();
		try {
			repo.crear(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Cliente> leer() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Cliente t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
