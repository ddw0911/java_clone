package day13.inheritance_advanced.emp_vo;

public class RempVO extends Employee {

  public RempVO() {
    // super();
  }

  public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
    super(name, age, phone, empDate, dept, marriage);
//    this.name = name;
//    this.age = age;
//    this.phone = phone;
//    this.empDate = empDate;
//    this.dept = dept;
//    this.marriage = marriage;
    // 해당객체 내에서 초기화하는 것이 바람직
  }

  public RempVO(String name, int age, String phone) {
    super(name, age, phone);
  }
}
