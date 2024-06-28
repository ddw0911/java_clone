package day13.inheritance_advanced.emp_vo;

public class MempVO extends Employee {

  String dept = "mdept";

  public MempVO() {

  }

  public MempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
    super(name, age, phone, empDate, dept, marriage);
    this.dept = dept;
  }
}
