package day17_db_ssg.exception;

public class ExceptionEx02 {

  public static void main(String[] args) {
    String[] array = {"1000", "1000", null, "200"};

//    for (String s : array) {
//      System.out.println(s);
//    }

    try {
      for (int i = 0; i < 4; i++) {
        int value = Integer.parseInt(array[i]);
        System.out.println("array[" + i + "] = " + value);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    } catch (NullPointerException | NumberFormatException e) {
      e.printStackTrace();
    }finally {
      System.out.println("안전 종료");
    }
  }
}
