package day10.prob.q3.q3;

public class PlayBird {

  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.setName("꽥꽥이");
    duck.fly();
    duck.sing();
    System.out.println(duck.toString());

    Sparrow sparrow = new Sparrow();
    sparrow.setName("짹짹");
    sparrow.fly();
    sparrow.sing();
    System.out.println(sparrow.toString());
  }
}
