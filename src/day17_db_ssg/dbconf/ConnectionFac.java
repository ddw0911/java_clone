package day17_db_ssg.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFac {

  private static final ConnectionFac instance = new ConnectionFac();

  private ConnectionFac() {

  }

  public static ConnectionFac getInstance() {
    return instance;
  }

  private static Connection connection = null;
  private static String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private static String id = "root";
  private static String pw = "wkdehd09!!";


  public Connection open() {
    try {
      connection = DriverManager.getConnection(url,id,pw);
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }

  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}