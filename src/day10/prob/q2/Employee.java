package day10.prob.q2;

public class Employee {

  private String name;
  private String dept;
  private int age;

  Employee() {
  }

  Employee(String name, int age, String dept) {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  void print(String name, int age, String dept) {
    System.out.println("이\t름 : " + name + "\t나 이 : " + age + "\t부\t서 : " + dept);
  }
}
