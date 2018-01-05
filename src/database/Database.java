package database;

public class Database {

  private String username;
  private String password;
  private String serverName;
  private String databaseName;

  public Database(String username, String password, String serverName, String databaseName) {
    super();
    this.username = username;
    this.password = password;
    this.serverName = serverName;
    this.databaseName = databaseName;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getServerName() {
    return serverName;
  }

  public String getDatabaseName() {
    return databaseName;
  }

}
