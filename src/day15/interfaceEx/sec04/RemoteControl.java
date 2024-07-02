package day15.interfaceEx.sec04;

public interface RemoteControl {

  //상수 필드
  int MAX_VOLUME = 10;
  int MIN_VOLUME = 0;

  //추상 메소드
  void turnOn();

  void turnOff();

  void setVolume(int volume);

  //디폴트 인스턴스 메소드
  default void setMute() {
    System.out.println("음소거");
    setVolume(0);
  }
}