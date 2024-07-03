package day15_interface.interfaceEx.sec04;

public class RemoteControlExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언
    RemoteControl rc;
    //Television 객체를 생성하고 인터페이스 변수에 대입
    rc = new Audio();
    //디폴트 메소드 호출
    rc.setMute();

    rc = new Television();
    rc.setMute();

    //Audio 객체를 생성하고 인터페이스 변수에 대입

    //디폴트 메소드 호출

  }
}