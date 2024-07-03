package day15_interface.interfaceEx.sec03;

public class Television implements RemoteControl{

  //필드
  int volume;

  @Override
  public void turnOn() {
    System.out.println("TV를 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끈다");

  }

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
    System.out.println("현재 TV의 볼륨은 : " + this.volume);
  }
  //turnOn() 추상 메소드 오버라이딩

  //turnOff() 추상 메소드 오버라이딩

  //setVolume() 추상 메소드 오버라이딩

}	