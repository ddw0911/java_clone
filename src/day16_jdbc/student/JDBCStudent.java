package day16_jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStudent {

  public static void getStudentInfo() {
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "select * from student";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 드라이버를 호출하는 코드
      con = DriverManager.getConnection(url, userName, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        String sno = rs.getString("sno");
        String name = rs.getString("name");
        int korean = rs.getInt("korean");
        int english = rs.getInt("english");
        int math = rs.getInt("math");
        int science = rs.getInt("science");
        int total = rs.getInt("total");
        int average = rs.getInt("average");
        String grade = rs.getString("grade");
        System.out.printf(
            "학번 : %s 이름 : %s  국어 : %d 영어 : %d 수학 : %d 과학 : %d  총점 : %d 평균 : %d 성적 : %s%n",
            sno, name, korean, english, math, science, total, average, grade);
      }
      rs.close();
      stmt.close();
      con.close();
//    } catch (ClassNotFoundException e) {
//      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static void insertStudent() {

  }
}
