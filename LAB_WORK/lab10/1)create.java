package exp10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class create {
  
  private static final String CREATE_TABLE_SQL="CREATE TABLE employee ("
                    + "empid INT NOT NULL,"
                    + "NAME VARCHAR(45) NOT NULL,"
                    + "city VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (empid))";
  
  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/employee";
    String username = "root";
    String password = "01234";

    Connection conn = null;
    Statement stmt = null;

    try {

      conn = DriverManager.getConnection(jdbcUrl, username, password);
      stmt = conn.createStatement();

      stmt.executeUpdate(CREATE_TABLE_SQL);

      System.out.println("Table created");

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        // Close connection
        if (stmt != null) {
          stmt.close();
        }
        if (conn != null) {
          conn.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
