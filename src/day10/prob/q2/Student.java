package day10.prob.q2;

public class Student {

  private String name;
  private int age;
  private int id;

  Student() {
  }

  Student(String name, int age, int id) {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  void print(String name, int age, int id) {
    System.out.println("이\t름 : " + name + "\t나 이 : " + age + "\t학\t번 : " + id);
  }
}
