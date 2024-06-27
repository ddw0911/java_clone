package day12.inheritance.extendex;

public class CatMain {

  public static void main(String[] args) {
    BabyCat babyCat = new BabyCat();
    System.out.println(babyCat.breed);
    System.out.println(babyCat.color);
    babyCat.eat();
    babyCat.meow();
  }

}
