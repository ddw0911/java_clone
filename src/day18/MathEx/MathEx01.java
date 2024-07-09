package day18.MathEx;

public class MathEx01 {

  public static void main(String[] args) {
//  절대값
    System.out.println(Math.abs(-1));
    // 반올림
    System.out.println(Math.round(1.4));
    System.out.println(Math.round(1.6));
    System.out.println(Math.round(-1.5));
    System.out.println(Math.round(1));
//  올림
    System.out.println(Math.ceil(1.4));
    System.out.println(Math.ceil(1.6));
    System.out.println(Math.ceil(-1.5));
    System.out.println(Math.ceil(1));
//   내림
    System.out.println(Math.floor(1.4));
    System.out.println(Math.floor(1.6));
    System.out.println(Math.floor(-1.5));
    System.out.println(Math.floor(1));
    // 제곱근
    System.out.println((int) Math.sqrt(9));
    // random
    int result = (int) (Math.random() * 10) + 1;
    int result1 = (int) Math.floor(Math.random() * 10) + 1;
  }
}
