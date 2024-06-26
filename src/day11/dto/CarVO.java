package day11.dto;

public class CarVO {

  public int carSn;
  public String carName;
  public int carPrice;
  public String carOwner;
  public int carYear;
  public char carType;

  public CarVO() {
  }

  public CarVO(int carSn, String carName, int carPrice, String carOwner, int carYear, char carType) {
    this.carSn = carSn;
    this.carName=carName;
    this.carPrice = carPrice;
    this.carOwner = carOwner;
    this.carYear = carYear;
    this.carType = carType;
  }
}
