package day11_model.dao;

import static day11_model.util.CarUtility.carPrint;

import day11_model.dto.CarVO;

public class CarDAO {

  public static void carInsert(CarVO car) {
    System.out.println(car.carName + " 자동차 정보가 DB에 저장되었습니다.");
  }

  public static void carSelect(CarVO car) {
    System.out.println(car.carName + " 자동차 정보가 조회되었습니다.");
    carPrint(car);
  }
}