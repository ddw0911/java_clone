package day12.inheritance.prob;

public class Q1 {

  public static void main(String[] args) {
    Drink coffee = new Drink("커피", 1500, 4);
    Drink greenTea = new Drink("녹차", 1100, 7);
    Alcohol wine = new Alcohol("와인", 15.1, 5000, 3);

    System.out.println("***** 매출전표 *****");
    coffee.printTitle();
    coffee.printData();
    greenTea.printData();

    System.out.println();
    wine.printTitle();
    wine.printData();
    System.out.printf("*** 총금액 %d원 ***", coffee.getTotalPrice() + greenTea.getTotalPrice() + wine.getTotalPrice());
  }
}

class Drink {

  String name;
  int price;
  int count;

  Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  void printTitle() {
    System.out.println("상품명\t\t단가\t\t수량\t\t금액");
  }

  void printData() {
    System.out.println(
        this.name + "\t\t\t" + this.price + "\t" + this.count + "\t\t\t"
            + this.getTotalPrice());
  }

  int getTotalPrice() {
    return this.price * this.count;
  }
}

class Alcohol extends Drink {

  double alcPer;

  Alcohol(String name, double alcPer, int price, int count) {
    super(name, price, count);
    this.alcPer = alcPer;
  }

  void printTitle() {
    System.out.println("상품명(도수[%])\t\t단가\t\t수량\t\t금액");
  }

  @Override
  void printData() {
    System.out.println(
        this.name + "(" + this.alcPer + ")\t\t\t\t" + this.price + "\t" + this.count + "\t\t\t"
            + this.getTotalPrice());
  }
}
