package day12_inheritance.morningquiz;

public class Account {

  static final int MIN_BALANCE= 0;
  static final int MAX_BALANCE= 1000000; // static final로 상수 처리

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
      return;
    }
    this.balance = balance;
  }
}
