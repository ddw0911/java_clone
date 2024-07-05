package day17_db_ssg.dbEx;

import day17_db_ssg.dbconf.ConnectionFac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {

  public static void main(String[] args) {
    String query = "SELECT userid,username,userage,useremail FROM users where userid = ?";
    Connection con = ConnectionFac.getInstance().open();
    ResultSet rs = null;
    try {
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, "u_04");

      rs = pstmt.executeQuery();
      if (rs.next()) {
        User user = new User(); // 레코드를 저장할 User 객체 생성
        user.setUserId(rs.getString("userid"));
        user.setUserName(rs.getString("username"));
        user.setUserAge(rs.getInt("userage"));
        user.setUserEmail(rs.getString("useremail"));
        System.out.println(user.toString());
      } else {
        System.out.println("존재하지 않는 회원입니다.");
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        ConnectionFac.getInstance().close();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
