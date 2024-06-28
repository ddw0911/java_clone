package assignment;

import java.util.Scanner;

public class BankApplication extends Account {

  Scanner sc = new Scanner(System.in);

  Account[] accounts = new Account[100];

  void startBankApplication() {
    showSelection();
  }

  void showSelection() {
    while (true) {
      System.out.println("--------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("--------------------------------------");
      System.out.print("선택> ");
      int i = sc.nextInt();
      sc.nextLine();
      switch (i) {
        case 1 -> openAccount();
        case 2 -> listAccount();
        case 3 -> depositResult();
        case 4 -> withdrawalResult();
        case 5 -> {exit();
        return;}
      }
    }
  }


  void openAccount() {
    System.out.println("----------------");
    System.out.println("계좌생성");
    System.out.println("----------------");

    System.out.print("계좌번호: ");
    accNum = sc.nextLine();

    System.out.print("계좌주: ");
    accOwner = sc.nextLine();

    System.out.print("초기입금액: ");
    initBalance = sc.nextInt();
    sc.nextLine();
    System.out.println("결과: 계좌가 생성되었습니다.");
  }

  void listAccount() {
    System.out.println("----------------");
    System.out.println("계좌목록");
    System.out.println("----------------");
    System.out.println(accNum + "\t\t" + accOwner + "\t\t" + initBalance);
  }

  void withdrawalResult() {
    System.out.println("----------------");
    System.out.println("출금");
    System.out.println("----------------");
    System.out.print("계좌번호: ");
    accNum = sc.nextLine();
    System.out.print("출금액: ");
    balance += sc.nextInt();
    sc.nextLine();
    System.out.println("결과: 출금이 성공되었습니다.");
  }

  void depositResult() {
    System.out.println("----------------");
    System.out.println("예금");
    System.out.println("----------------");
    System.out.print("계좌번호: ");
    accNum = sc.nextLine();
    System.out.print("예금액: ");
    balance += sc.nextInt();
    sc.nextLine();
  }

  void exit() {
    System.out.print("프로그램 종료");
  }
}
