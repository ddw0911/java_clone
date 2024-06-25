package day10.section2;

public class User {

  //필드 - 국적, 이름, 주민번호
  //이름과 주민번호는 입력받아 객체 생성 가능
  private String country = "Africa";
  private String name = "Gredo";
  private String id = "921020-1088291";

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
