package day15_interface.interfaceEx.sec07;

public class SmartTelevision implements RemoteControl, Searchable {

  private int volume;

  @Override
  public void turnOn() {
    System.out.println("스마트 TV를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("스마트 TV를 끕니다");
  }

  @Override
  public void search(String url) {
    System.out.println("url을 찾습니다");
  }

  private int memoryVolume;

  @Override
  public void setMute(boolean mute) {
    this.memoryVolume = this.volume;
    if (mute) {
      System.out.println("음소거");
      this.volume = MIN_VOLUME;
    }
  }
}		