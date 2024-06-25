package day10.prob.q3.q2;

public class Account {

  String accNo;
  int balance;

  Account() {

  }

  Account(String accNo) {
    this.accNo = accNo;
  }

  void save(int a) {
    balance += a;
    System.out.println(this.accNo + " 계좌에 " + a + " 만원이 입금되었습니다.");
  }

  void deposit(int b) {
    balance -= b;
    System.out.println(this.accNo + " 계좌에 " + b + " 만원이 출금되었습니다.");
  }

  void getAccNo() {
    System.out.println(accNo + " 계좌가 개설되었습니다.");
  }

  void getBalance() {
    System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
  }
}
