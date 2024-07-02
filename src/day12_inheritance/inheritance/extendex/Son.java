package day12_inheritance.inheritance.extendex;

public class Son extends Father{

  String name = "길동";

  void printDetails() {
    System.out.println("나의 이름은 " + super.familyName + this.name);
    System.out.println("나의 아버지는 " + fatherJob);
    System.out.println(houseAddress());
  }

  public static void main(String[] args) {
    Son objSon = new Son();
    objSon.printDetails();
  }
}