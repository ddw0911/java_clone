package day16_jdbc.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx extends MemberDB{

  public static void main(String[] args) {
//    memberInsert(5, "qqq", "mafia");
    JdbcEx ex = new JdbcEx();
//    ex.memberUpdate();
    memberSearch();
//    memberInsert(new Member());
//
//    memberDelete();

  }

  public static void memberSearch() {
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");

        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s  job : %s%n", id, name, job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  // 인스턴스로 입력받는 메서드
  public static void memberInsert(Member member) {
    Scanner sc = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null; // Syntax는 캐시에 저장해놓고 데이터만 변경
    int result = 0;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      pstmt = con.prepareStatement(query);
      System.out.println("=====신규등록=====");
      System.out.print("번호를 입력해주세요: ");
      int id = sc.nextInt();
      sc.nextLine();
      member.setId(id);
      System.out.print("이름을 입력해주세요: ");
      String name = sc.nextLine();
      member.setName(name);
      System.out.print("직업을 입력해주세요: ");
      String job = sc.nextLine();
      member.setJob(job);
      pstmt.setInt(1, member.getId());
      pstmt.setString(2, member.getName());
      pstmt.setString(3, member.getJob());

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      System.out.println("이미 있는번호입니다.");
    }
  }

  // 매개변수로 입력받는 메서드
  public static void memberInsert(int id, String name, String job) {
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null; // Syntax는 캐시에 저장해놓고 데이터만 변경
    int result = 0;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, id);
      pstmt.setString(2, name);
      pstmt.setString(3, job);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  // 직접 입력받는 메서드
  @Override
  public void memberInsert() {
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null; // Syntax는 캐시에 저장해놓고 데이터만 변경
    int result = 0;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, 4);
      pstmt.setString(2, "jjj");
      pstmt.setString(3, "singer");

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void memberUpdate() {
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "UPDATE member SET ? = ? where ? = ?";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      pstmt = con.prepareStatement(query);
      pstmt.setString(1, "job");
      pstmt.setString(2, "citizen");
      pstmt.setString(3, "id");
      pstmt.setInt(4, 5);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 갱신되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 갱신이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void memberDelete() {

  }
}