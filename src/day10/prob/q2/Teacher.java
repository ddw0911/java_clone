package day10.prob.q2;

public class Teacher {

  private String name;
  private int age;
  private String subject;

  Teacher() {
  }

  Teacher(String name, int age, String subject) {
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

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  void print(String name, int age, String subject) {
    System.out.println("이\t름 : " + name + "\t나 이 : " + age + "\t담당과목 : " + subject);
  }
}
