package day18.wrapperex;

public class WrapEx01 {

  public static void main(String[] args) {
    // 100값을 객체로 생성 (박싱)
    Integer value = 100; // Auto-Boxing (JAVA 1.5 부터)
    int v = value.intValue(); // 언박싱
    int v1 = value; // Auto-Unboxing
    v = v + 100;
    value = v; // 박싱

    Boolean b1 = true;
    boolean b2 = b1.booleanValue();

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result = num1 + num2;
    System.out.println(result);

    // 객체값 비교 /w equals()
    System.out.println(num1.equals(num2));
    System.out.println(num1 == num2); // 객체주소 비교
    System.out.println(num1 < num2);

    // String 문자를 포장객체가 언박싱할때
    String s = "10";

    int val = Integer.parseInt(s);
    double val2 = Double.parseDouble(s);
    byte val3 = Byte.parseByte(s);
    short val4 = Short.parseShort(s);
    long val5 = Long.parseLong(s);


    int sum = 0;
    for (int i = 1; i < 1000000000; i++) {
      sum += i;
    }
    System.out.println(sum);

    int wrapSum = 0;
    for (Integer i = 1; i < 1000000000; i++) {
      sum += i;
    }
    System.out.println(wrapSum);
  }
}
