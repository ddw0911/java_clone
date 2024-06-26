package day11.exec;

import day11.model.Person;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMan {

  public static void main(String[] args) throws IOException {
    Person hong = new Person();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    personInfoPrint(br.readLine(),
        Integer.parseInt(br.readLine()),
        br.readLine());

    Person naju = new Person("나주인", 25);
    naju.phone = "010-4444-2222";
//    System.out.println(naju.toString());

    personInfoPrintObj(naju);
  }

  public static void personInfoPrint(String name, int age, String phone) {
    System.out.println("이름 : " + name + " ,나이 : " + age + " , 연락처 : " + phone);
  }

  public static void personInfoPrintObj(Person person) {
    System.out.println("이름 : " + person.name + " ,나이 : " + person.age + " , 연락처 : " + person.phone);
  }
}
