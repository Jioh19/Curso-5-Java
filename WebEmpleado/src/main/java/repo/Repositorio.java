package repo;

import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T> {
	int create(T t) throws SQLException;
	List<T> getAll() throws SQLException;
	T getId(int id) throws SQLException;
	void update(T t) throws SQLException;
	void delete(int id) throws SQLException;
	
}
