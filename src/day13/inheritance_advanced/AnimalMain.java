package day13.inheritance_advanced;


import day13.inheritance_advanced.animal_vo.Animal;
import day13.inheritance_advanced.animal_vo.Cat;
import day13.inheritance_advanced.animal_vo.Dog;

public class AnimalMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Animal x = new Cat(); // 업캐스팅
    x.eat();
//    x.night(); // 오버라이드한 메서드만 사용가능
//    Cat c = (Cat) x; // 다운캐스팅
    ((Cat)x).night();

    x = new Dog();
    x.eat();
  }
}
