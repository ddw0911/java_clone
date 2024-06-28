package day13.inheritance_advanced.prob1;

public class Account {

  private String accId;
  private long balance;
  private String ownerName;

  Account() {
  }

  Account(String accId, long balance, String ownerName) {
    setAccId(accId);
    setBalance(balance);
    setOwnerName(ownerName);
  }

  void deposit(long amount) {
    this.balance += amount;
  }

  void withdraw(long amount) {
    this.balance -= amount;
  }

  public String getAccId() {
    return accId;
  }

  public void setAccId(String accId) {
    this.accId = accId;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }
}
