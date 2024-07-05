package day16_jdbc.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx extends MemberDB {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    JdbcEx ex = new JdbcEx();
    memberSearch();
//    memberInsert(4, "lll", "singer");
//    memberInsert(new Member());

    ex.memberUpdate();

//    memberSearch();
//
//    ex.memberDelete();
    memberSearch();

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
    Scanner sc = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";

    Connection con = null;
    PreparedStatement pstmt = null;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);

      System.out.print("수정하실 회원번호를 입력해주세요 : ");
      int inputId = sc.nextInt();
      sc.nextLine();
      System.out.print("어떤 정보를 수정하시겠습니까? (name, job) : ");
      String inputAttribute = sc.nextLine();
      System.out.print("어떻게 수정하시겠습니까? : ");
      String inputUpdate = sc.nextLine();
      String query =
          "UPDATE member SET "+ inputAttribute + " = ? where id = ?"; // ? place holder는 value에만 사용한다
      pstmt = con.prepareStatement(query);
      pstmt.setString(1, inputUpdate);
      pstmt.setInt(2, inputId);
      int result = pstmt.executeUpdate();
      pstmt.close();
      con.close();
      if (result == 1) {
        System.out.println("회원 정보가 수정되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

  @Override
  public void memberDelete() {
    String url = "jdbc:mysql://localhost:3306/Employees";
    String userName = "root";
    String password = "wkdehd09!!";
    String query = "DELETE FROM member where id = ?";

    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      con = DriverManager.getConnection(url, userName, password);
      System.out.print("삭제할 회원번호를 입력하세요: ");
      int deleteId = sc.nextInt();
      sc.nextLine();
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, deleteId);
      pstmt.executeUpdate();
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}