package day15_interface.interfaceEx.sec10.exam02;

public class DriverExample {

  public static void main(String[] args) {
    //Driver 객체 생성
    Driver driver = new Driver();

    //Vehicle 구현 객체 생성
    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    //매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
    driver.drive(bus);
    driver.drive(taxi);

    // 인터페이스 변수에 구현체를 적용시켜
    Vehicle vc;
    vc = new Bus();
    vc.run();
    vc = new Taxi();
    vc.run();

  }
}