package day10.section1;

public class User {

  //필드 - 국적, 이름, 주민번호
  //이름과 주민번호는 입력받아 객체 생성 가능
  String country = "Africa";
  String name = "Gredo";
  String id = "921020-1088291";

  User() {
  }

  User(String name, String id) {
    this.name = name;
    this.id = id;
  }

  User(String country, String name, String id) {
    this.country = country;
    this.name = name;
    this.id = id;
  }
}
