package day15_interface.interfaceEx.sec03;

public class Audio implements RemoteControl {
  //필드
  int volume;

  //turnOn() 추상 메소드 오버라이딩
  @Override
  public void turnOn() {
    System.out.println("오디오를 켠다");
  }
  //turnOff() 추상 메소드 오버라이딩
  @Override
  public void turnOff() {
    System.out.println("오디오를 끈다");
  }

  //setVolume() 추상 메소드 오버라이딩
  @Override
  public void setVolume(int volume) {
    if (volume > MAX_VOLUME) {
      System.out.println("최대볼륨입니다.");
      this.volume = MAX_VOLUME;
    } else if (volume <= MIN_VOLUME) {
      System.out.println("최소볼륨입니다.");
      this.volume = MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 오디오의 볼륨 : " + this.volume);
  }
}