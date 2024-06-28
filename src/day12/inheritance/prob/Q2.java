package day12.inheritance.prob;

public class Q2 {

  public static void main(String[] args) {
    Student hong = new Student("홍길동", "javaprogram", 30);
    hong.print();
  }
}

class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee() {
    if (subject.equals("javaprogram")) {
      this.returnFee = (double) fee * 0.25;
    } else if (subject.equals("jspprogram")) {
      this.returnFee = (double) fee * 0.20;
    } else {
      System.out.print("그런 과정은 없습니다.");
    }
  }

  public void print() {
    this.calcReturnFee();
    System.out.println(
        name + " 씨의 과정명은 " +
        subject + " 이고 교육비는 " +
            fee+ "이며 환급금은 " +
            returnFee + " 입니다.");

  }
}
