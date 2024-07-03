package day15_interface.interfaceEx.sec07;

public interface RemoteControl {

  int MIN_VOLUME = 0;
  //추상 메소드
  void turnOn();

  void turnOff();

  default void setVolume(int volume) {
    System.out.println("볼륨조절");
    this.setVolume(volume);
  }

  void setMute(boolean mute);
}