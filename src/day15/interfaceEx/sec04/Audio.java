package day15.interfaceEx.sec04;


public class Audio implements RemoteControl {

  //필드
  private int volume;

  //turnOn() 추상 메소드 오버라이딩
  @Override
  public void turnOn() {
    System.out.println("오디오를 켭니다.");
  }

  //turnOff() 추상 메소드 오버라이딩
  @Override
  public void turnOff() {
    System.out.println("오디오를 끕니다.");
  }

  //setVolume() 추상 메소드 오버라이딩
  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 오디오 볼륨: " + volume);
  }

  private int rememberVolume;

  @Override
  public void setMute() {
    this.rememberVolume = this.volume;
    System.out.println("오디오 음소거");
    this.volume = MIN_VOLUME;
    System.out.println("현재 볼륨 : " + MIN_VOLUME);
  }
}

//turnOn() 추상 메소드 오버라이딩

//turnOff() 추상 메소드 오버라이딩

//setVolume() 추상 메소드 오버라이딩

//필드

//디폴트 메소드 재정의
