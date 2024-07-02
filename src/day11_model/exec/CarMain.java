package day11_model.exec;

import static day11_model.dao.CarDAO.carInsert;
import static day11_model.dao.CarDAO.carSelect;

import day11_model.dto.CarVO;

public class CarMain {

  public static void main(String[] args) {
    CarVO volvo = new CarVO(1110, "volvo", 750000000, "홍길동", 2010, 'D');
    CarVO toyota = new CarVO(4444, "toyota", 50000000, "나주인", 2015, 'G');

    carInsert(volvo);
    carSelect(volvo);

    carInsert(toyota);
    carSelect(toyota);
  }
}
