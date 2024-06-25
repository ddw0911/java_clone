package day10.section1;

public class Car {

  //필드 선언 - 회사 모델 차량번호 색상 최대속력 속력
  String company = "Volvo";
  String model = "V31003";
  String carNumber = "1234567";
  String color = "black";
  int maxSpeed = 300;
  int speed;

  // 메서드 선언
  // 디폴트 생성자 - 컴파일러가 지정
  Car() {
  }
  // 생성자 오버로딩
  Car(String company, String model, String color) {
    this.company = company;
    this.model = model;
    this.color = color;
  }
}
