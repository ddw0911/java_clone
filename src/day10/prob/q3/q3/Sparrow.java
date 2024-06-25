package day10.prob.q3.q3;

public class Sparrow {
  String name;
  int legs;
  int length;

  String fly() {
    return "날아다닙니다.";
  }

  String sing() {
    return "소리내어 웁니다.";
  }

  void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return "참새(" + name + ")가 " + this.fly() + "\n참새(" + name + ")가 " + this.sing() + "\n참새의 이름은 "  + name + " 입니다.";

  }
}
