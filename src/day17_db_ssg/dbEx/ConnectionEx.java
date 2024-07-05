package day17_db_ssg.dbEx;

import java.sql.Connection;
import java.sql.*;
public class ConnectionEx {

  private static Connection connection = null;
  private static String url = "jdbc:mysql://localhost:3306/ssgdatabase";
  private static String id = "root";
  private static String pw = "wkdehd09!!";

  public static void main(String[] args) {

    try {
      // JDBC 드라이버를 등록
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 연결
      connection = DriverManager.getConnection(url, id, pw); // 예외처리 필요
      System.out.println("connection 객체 값 = " + connection);
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      if (connection != null) {
        try {
          connection.close(); // 예외처리 필요
          System.out.println("연결종료");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }
  }
}