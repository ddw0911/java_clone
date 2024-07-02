package day12_inheritance.morningquiz;

public class Q19 {

  public static void main(String[] args) {
    Account acc = new Account();
    acc.setBalance(10000);
    System.out.println("현재 잔고는 " + acc.getBalance() + "원 입니다.");

    acc.setBalance(-100);
    acc.setBalance(99999999);
    System.out.println("현재 잔고는 " + acc.getBalance() + "원 입니다.");
  }
}
