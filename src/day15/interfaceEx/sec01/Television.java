package day15.interfaceEx.sec01;

public class Television implements RemoteControl{


  @Override
  public void turnOn() {
    System.out.println("TV의 전원을 켠다.");
  }
}