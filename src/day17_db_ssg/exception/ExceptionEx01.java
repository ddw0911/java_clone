package day17_db_ssg.exception;

public class ExceptionEx01 {

  public static void main(String[] args) {
    printLengthString("JavaDataBase_programming");
//    printLengthString(null); // 예외처리가 되었기 때문에 프로그램이 정상종료한다. exit code 0
  }

  public static void printLengthString(String data) {
    int result = 0;
    try {
      result = data.length();
      System.out.println("문자 수 = " + result);

      Class.forName("java.lang.string"); // 해당 클래스를 찾지 못해 예외처리
      System.out.println("String 클래스가 존재합니다.");
    } catch (NullPointerException e) {
      //예외 메시지 확인방법
//      System.err.println(e.getMessage());
//      System.out.println(e.toString());
      e.printStackTrace();
      System.out.println("예외처리되었습니다.");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (Exception e) { // 예외의 최상위클래스로 일괄처리해버리기
        e.printStackTrace();
    } finally {
      System.out.println("마무리하세요.");
    }
  }
}
