package day17_db_ssg.dbEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {

  public static void main(String[] args) {
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/ssgdatabase";
    String id = "root";
    String pw = "wkdehd09!!";
    String query = "INSERT INTO users(userid,username,userage,useremail) VALUES(?,?,?,?)";

    try {
      connection = DriverManager.getConnection(url, id, pw); // 연결
      // pstmt 객체 생성하여 쿼리문 넣기
      PreparedStatement pstmt = connection.prepareStatement(query);
      // 객체 파라미터 순서에 맞게 데이터 할당
      pstmt.setString(1, "u_04");
      pstmt.setString(2, "ooo");
      pstmt.setInt(3, 27);
      pstmt.setString(4, "444@gmail.com");
      // 쿼리 실행
      int result = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 : " + result);
      pstmt.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      if (connection != null) {
        try {
          connection.close();
          System.out.println("종료");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }
  }
}
