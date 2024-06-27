package day12.inheritance.extendex;

public class Inheritance01 extends Calculation{

  void multiplication() {
    System.out.println("두 수의 곱셉 : 200");
  }

  public static void main(String[] args) {
    Inheritance01 obj = new Inheritance01();
    obj.addition();
    obj.subtraction();
    obj.multiplication();
  }
}
