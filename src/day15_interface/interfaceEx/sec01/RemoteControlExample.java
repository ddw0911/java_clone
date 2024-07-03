package day15_interface.interfaceEx.sec01;

public class RemoteControlExample {

  public static void main(String[] args) {

    //rc 변수에 Television 객체를 대입
    RemoteControl rc = new Television();
    rc.turnOn();
    //rc 변수에 Audio 객체를 대입(교체시킴)
    // 인터페이스 변수를 통해 turnOn메서드가 호출되면
    // 실제로 실행 되는것은 해당 인스턴스의 turnOn메서드 (동적바인딩)
    rc = new Audio();
    rc.turnOn();
  }
}