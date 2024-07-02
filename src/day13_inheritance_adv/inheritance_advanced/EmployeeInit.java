package day13_inheritance_adv.inheritance_advanced;

import day13_inheritance_adv.inheritance_advanced.emp_vo.RempVO;

public class EmployeeInit {

  public static void main(String[] args) {
    RempVO hong = new RempVO("홍길동", 33, "010-1111-1111","2010. 01 .01", "홍보부", true);
    System.out.println(hong);
    RempVO yang = new RempVO("양동근", 43, "010-1111-1131", "2000.01 .01", "개발팀", true);
    System.out.println(yang);
  }
}