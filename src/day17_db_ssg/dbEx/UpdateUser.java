package day17_db_ssg.dbEx;

import day17_db_ssg.dbconf.ConnectionFac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {

  public static void main(String[] args) {
    Connection connection = ConnectionFac.getInstance().open();
    String query = new StringBuilder()
        .append("UPDATE users SET ")
        .append("userage = ? ,")
        .append("useremail = ? ")
        .append("where userid = ?")
        .toString();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setInt(1, 35);
      pstmt.setString(2, "444@naver.com");
      pstmt.setString(3, "u_04");

      int result = pstmt.executeUpdate();
      System.out.println("수정된 요청 개수 : " + result);
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      ConnectionFac.getInstance().close();
      System.out.println("연결종료");
    }

  }

}
