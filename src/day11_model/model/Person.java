package day11_model.model;

public class Person {

  public String name;
  public int age;
  public String phone;

  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void play() {
    System.out.println("운동을 한다.");
  }
  public void eat() {
    System.out.println("음식을 먹다.");
  }
  public void walk() {
    System.out.println("걷다.");
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        '}';
  }
}