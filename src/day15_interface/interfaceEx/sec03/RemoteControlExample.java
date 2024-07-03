package day15_interface.interfaceEx.sec03;

public class RemoteControlExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언
    RemoteControl rc;
    //Television 객체를 생성하고 인터페이스 변수에 대입

    rc = new Audio();
    rc.turnOn();
    rc.turnOff();
    rc.setVolume(10);

    RemoteControl rc2;
    //Audio 객체를 생성하고 인터페이스 변수에 대입
    rc2 = new Television();
    rc2.turnOn();
    rc2.turnOff();
    rc2.setVolume(20);

  }
}