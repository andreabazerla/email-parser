package database;

import java.util.StringJoiner;

public class Query {
  
  private String tableName;
  private String primaryKey;
  private String emailColumn;
  
  public Query(String tableName, String primaryKey, String emailColumn) {
    this.tableName = tableName;
    this.primaryKey = primaryKey;
    this.emailColumn = emailColumn;
  }

  @Override
  public String toString() {
    return "SELECT " + getColumns() + " FROM " + getTableName();
  }

  private String getColumns() {
    StringJoiner stringJoiner = new StringJoiner(",");
    
    stringJoiner.add(primaryKey);
    stringJoiner.add(emailColumn);
    
    return stringJoiner.toString();
  }

  public String getTableName() {
    return tableName;
  }
  
  public String getPrimaryKey() {
    return primaryKey;
  }

  public String getEmailColumn() {
    return emailColumn;
  }
  
}
