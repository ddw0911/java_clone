package day10.prob.q3.q2;

public class TestAccount {

  public static void main(String[] args) {
    Account acc = new Account("078-3762-293");
    acc.getAccNo();
    acc.getBalance();
    acc.save(100);
    acc.getBalance();
    acc.deposit(30);
    acc.getBalance();
  }
}
