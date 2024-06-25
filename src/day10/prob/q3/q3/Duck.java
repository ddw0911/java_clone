package day10.prob.q3.q3;

public class Duck {

  String name;
  int legs;
  int length;

  String fly() {
    return "날지 않습니다.";
  }

  String sing() {
    return "소리내어 웁니다.";
  }

  void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return "오리(" + name + ")는 " + this.fly() + "\n오리(" + name + ")가 " + this.sing() + "\n오리의 이름은 "  + name + " 입니다.";
  }
}
