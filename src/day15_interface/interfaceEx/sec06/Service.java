package day15_interface.interfaceEx.sec06;

public interface Service {

  // 인터페이스에서 구성가능한 메서드

  //디폴트 메소드
  default void defaultMethod1() {
    System.out.println("디폴트 메서드1 : 구현부 실행");
    defaultCommonMethod3(); // private 메서드를 디폴트메서드로 실행시키기
  }

  default void defaultMethod2() {
    System.out.println("디폴트 메서드2 : 구현부 실행");
  }

  //private 메소드
  private void defaultCommonMethod3() {
    System.out.println("디폴트 커먼 메서드3 : 중복코드 A 구현부 실행");
  }

  //정적 메소드
  static void staticMethod1() {
    System.out.println("스태틱 메서드1");
    staticCommon();

  }

  //private 정적 메소드
  private static void staticCommon() {
    System.out.println("스태틱 커먼");
  }
}