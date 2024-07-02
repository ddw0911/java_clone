package day15.interfaceEx.sec06;

public class ServiceExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언과 구현 객체 대입
      Service sv = new ServiceImpl();
    //디폴트 메소드 호출
      sv.defaultMethod1();
      sv.defaultMethod2();
    //정적 메소드 호출
      Service.staticMethod1();
  }
}