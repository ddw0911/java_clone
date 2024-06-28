package day13.inheritance_advanced.animal_vo;

public class Dog extends Animal{

  public Dog() {
    super();
  }

  @Override // Super 클래스의 동일한이름, 동일한 파라미터를 가진 메서드를 재정의
  public void eat() {
    System.out.println("Dog eat!");
  }
}
