package day17_db_ssg.dbEx;

import day17_db_ssg.dbconf.ConnectionFac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {

  public static void main(String[] args) {
    String query = "SELECT userid,username,userage,useremail FROM users";

    Connection con = ConnectionFac.getInstance().open();
    ResultSet rs = null;
    ArrayList<User> users = new ArrayList<>();

    try {
      PreparedStatement pstmt = con.prepareStatement(query);

      rs = pstmt.executeQuery();
        while (rs.next()) { // ResultSet 커서의 위치에 있는 레코드의 값을 읽어들인다
          try {
            User user = new User(); // 레코드를 저장할 User 객체 생성
            user.setUserId(rs.getString("userid")); // rs에서 읽어들인 값을 user 객체의 데이터로 저장
            user.setUserName(rs.getString("username"));
            user.setUserAge(rs.getInt("userage"));
            user.setUserEmail(rs.getString("useremail"));

//            System.out.println(user.toString()); // 저장된 데이터 확인
            users.add(user); // 데이터가 저장된 user 객체를 리스트에 저장

          } catch (SQLException e) {
            System.out.println("존재하지 않는 회원입니다.");
            break;
          }
      }
      for (User user : users) { //리스트의 모든 user 객체의 데이터 출력
        System.out.println(user);
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
