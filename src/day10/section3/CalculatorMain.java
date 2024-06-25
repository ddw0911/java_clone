package day10.section3;

public class CalculatorMain {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.powerOn();
    System.out.println(calculator.plus(1, 2));
    System.out.println(calculator.divide(3.4, 1.2));
    calculator.powerOff();
  }
}
