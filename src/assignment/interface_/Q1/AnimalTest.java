package assignment.interface_.Q1;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Cheatable cheatableChicken = new Chicken(5);
    Chicken cheat = (Chicken) cheatableChicken;

    System.out.println("1시간 후");
    dog.run(1);
    chicken.run(1);
    cheat.fly(1);

    System.out.println("2시간 후");
    dog.run(2);
    chicken.run(2);
    cheat.fly(2);

    System.out.println("3시간 후");
    dog.run(3);
    chicken.run(3);
    cheat.fly(3);

  }
}
