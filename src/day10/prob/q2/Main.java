package day10.prob.q2;

public class Main {

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();
    Employee employee = new Employee();
    student.print("홍길동", 20, 200201);
    employee.print("이순신", 40, "JAVA");
    teacher.print("유관순", 40, "교무과");
  }
}
