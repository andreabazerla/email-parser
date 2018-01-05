package reader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.Database;
import database.Query;

public abstract class ReaderDatabaseBasic<T> implements ReaderDatabase<T> {

  private Database database;
  private Query query;

  public ReaderDatabaseBasic(Database database, Query query) {
    this.database = database;
    this.query = query;
  }

  @Override
  public abstract Connection createConnection()
      throws SQLException, ClassNotFoundException;
  
  @Override
  public abstract ResultSet getResultSet(Connection connection) throws SQLException;

  @Override
  public Database getDatabase() {
    return database;
  }

  @Override
  public Query getQuery() {
    return query;
  }

}
