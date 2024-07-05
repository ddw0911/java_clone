package day17_db_ssg.dbEx;

import day17_db_ssg.dbconf.ConnectionFac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser {

  public static void main(String[] args) {
    Connection connection = ConnectionFac.getInstance().open();
    String query = new StringBuilder()
        .append("DELETE FROM users ")
        .append("where userid = ?")
        .toString();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1, "u_04");

      int result = pstmt.executeUpdate();
      System.out.println("삭제된 요청 개수 : " + result);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFac.getInstance().close();
      System.out.println("연결종료");
    }

  }

}
