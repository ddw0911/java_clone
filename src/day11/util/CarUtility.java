package day11.util;

import day11.dto.CarVO;

public class CarUtility {

  public static void carPrint(CarVO car) {
    System.out.println("일련번호 = " + car.carSn);
    System.out.println("차종 = " + car.carName);
    System.out.println("가격 = " + car.carPrice);
    System.out.println("소유주 = " + car.carOwner);
    System.out.println(car.carYear + "년식");
    System.out.println("타입 = " + car.carType);
  }
}
