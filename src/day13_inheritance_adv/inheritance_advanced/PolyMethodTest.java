package day13_inheritance_adv.inheritance_advanced;

import day13_inheritance_adv.inheritance_advanced.animal_vo.Animal;
import day13_inheritance_adv.inheritance_advanced.animal_vo.Cat;
import day13_inheritance_adv.inheritance_advanced.animal_vo.Dog;

public class PolyMethodTest {

  public static void main(String[] args) {
//    Dog dog = new Dog();
//    display(dog);
//    Cat cat = new Cat();
//    display(cat);
    Animal animal = new Animal();
    display(animal);
    animal = new Dog();
    display(animal);
    animal = new Cat(); // Cat 클래스 참조
    display(animal);
    // Cat에 eat메서드가 오버라이드 되어있으므로 
    // (동적 바인딩에 의해) animal.eat이 아닌 cat.eat 메서드가 실행된다
  }

  public static void display(Dog dog) {
    dog.eat();
  }

  public static void display(Cat cat) {
    cat.eat();
  }

  public static void display(Animal animal) { // 하나의 타입으로 여러 타입을 받을 수 있다 - Animal: 다형성 인수
    animal.eat();
    if (animal instanceof Cat) { // instanceof 객체의 타입 검사 연산자
      ((Cat) animal).night();
    }
  }
}
