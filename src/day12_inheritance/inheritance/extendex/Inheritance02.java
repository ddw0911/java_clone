package day12_inheritance.inheritance.extendex;

public class Inheritance02 {
  public static void main(String[] args) {
    Child objChild = new Child();
    objChild.printDetails();
  }
}

class Parent {
  String name = "홍길순";

  void details() {
    System.out.println(name);
  }
}

class Child extends Parent {
  String name = "홍길동";

  @Override
  void details() {
    System.out.println(name);
  }

  void printDetails() {
    super.details();
    this.details();
    System.out.println("부모 이름 : " + super.name);
    System.out.println("자식 이름 : " + this.name);
  }
}



