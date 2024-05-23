package cl.bootcamp.Dao;

import java.sql.SQLException;
import java.util.List;

public interface Crud<T> {
	int crear(T t) throws SQLException;
	List<T> leer() throws SQLException;
	T leerUno(int id) throws SQLException;
	int actualizar(T t) throws SQLException;
	int eliminar(int id) throws SQLException;
}
