package day10.section1;

public class CarMain {
  // Car 클래스를 객체로 생성하여 실행하는 클래스
  public static void main(String[] args) {
    // 자동차 클래스로 객체 한 개 생성
    Car volvo = new Car();
    // volvo 자동차의 값을 출력하세요.
    System.out.println("company : " + volvo.company);
    System.out.println("color : " + volvo.color);
    System.out.println("model : " + volvo.model);

    Car myCar = new Car("현대기아", "뉴카니발", "white");
    System.out.println("company : " + myCar.company);
    System.out.println("color : " + myCar.color);
    System.out.println("model : " + myCar.model);
  }
}
