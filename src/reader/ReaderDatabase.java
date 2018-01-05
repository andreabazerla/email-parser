package reader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.Database;
import database.Query;

public interface ReaderDatabase<T> extends Reader<T> {

  public Connection createConnection()
      throws SQLException, ClassNotFoundException;
      
  public ResultSet getResultSet(Connection connection) throws SQLException;

  public Database getDatabase();

  public Query getQuery();

}
