package cl.bootcamp.dao;

import java.sql.SQLException;
import java.util.List;

public interface Crud<T> {
  int create(T t) throws SQLException;
  List<T> getAll() throws SQLException;
  T getOne(int id) throws SQLException;
  int update(T t) throws SQLException;
  int delete(int id) throws SQLException;
}
