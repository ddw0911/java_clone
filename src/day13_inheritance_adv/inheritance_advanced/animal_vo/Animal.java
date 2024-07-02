package day13_inheritance_adv.inheritance_advanced.animal_vo;

public class Animal extends Object{

  public Animal() {
    super(); // new Object();
  }

  public void eat() {
    System.out.println("Animal eat!");
  }
}
