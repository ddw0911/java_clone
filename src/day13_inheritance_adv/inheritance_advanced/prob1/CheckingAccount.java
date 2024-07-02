package day13_inheritance_adv.inheritance_advanced.prob1;

public class CheckingAccount extends Account {

  private String cardNo;

  CheckingAccount() {
  }

  CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
    super(accId, balance, ownerName);
    setCardNo(cardNo);
  }

  void pay(long amount, String cardNo) {
    if (this.cardNo.equals(cardNo)) {
      if (amount <= this.getBalance()) {
        withdraw(amount);
      } else {
        System.out.println("지불이 불가능합니다.");
      }
    } else {
      System.out.println("올바른 카드번호를 입력하세요.");
    }
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }
}
