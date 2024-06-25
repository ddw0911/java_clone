package day10.prob.q3.q1;

public class EmpMain {

  public static void main(String[] args) {
    Emp emp = new Emp("홍길동", "12345", 50000);
    System.out.println(emp.toString());
    System.out.println("봉급 = " + emp.getSalary(30));
  }
}
