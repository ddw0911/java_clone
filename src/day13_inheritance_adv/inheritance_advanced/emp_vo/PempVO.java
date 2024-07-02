package day13_inheritance_adv.inheritance_advanced.emp_vo;

public class PempVO extends Employee {

  String dept = "period";

  public PempVO() {

  }

  public PempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
    super(name, age, phone, empDate, dept, marriage);
    this.dept = dept;
  }
}
