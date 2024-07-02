package assignment.interface_.Q1;

public class Chicken extends Animal implements Cheatable{

  Chicken() {

  }

  Chicken(int speed) {
    this.speed = speed;
  }

  @Override
  void run(int hours) {
      this.distance = hours * speed;
      System.out.println("닭의 이동거리=" + getDistance());
    }

  public void fly(int hours) {
    this.distance = hours * speed * 2;
    System.out.println("날으는 닭의 이동거리=" + getDistance());
  }

  @Override
  public void fly() {
  }
}
