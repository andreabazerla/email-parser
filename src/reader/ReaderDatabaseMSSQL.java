package reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.Database;
import database.DatabaseConfig;
import database.Query;
import exception.ExceptionReader;

public class ReaderDatabaseMSSQL<Email> extends ReaderDatabaseBasic<Email> {

  private ResultSet resultSet;
  
  public ReaderDatabaseMSSQL(Database database, Query query) {
    super(database, query);
    
    try {
      this.resultSet = getResultSet(createConnection());
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public Connection createConnection()
      throws SQLException, ClassNotFoundException {

    Class.forName(DatabaseConfig.DATABASE_DRIVER_MSSQL);

    String url = DatabaseConfig.DATABASE_URL_JDBC + getDatabase().getServerName() + ";database="
        + getDatabase().getDatabaseName() + ";user=" + getDatabase().getUsername() + ";password="
        + getDatabase().getPassword();

    Connection connection = DriverManager.getConnection(url);

    return connection;
  }

  @Override
  public ResultSet getResultSet(Connection connection) throws SQLException {

    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(getQuery().toString());

    return resultSet;

  }

  @Override
  public Email readItem() throws ExceptionReader {
    try {
      return (Email) new objects.Email(resultSet.getString(getQuery().getEmailColumn()));
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public boolean hasNext() throws ExceptionReader {
    try {
      return resultSet.next();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public void close() throws ExceptionReader {

  }

}
