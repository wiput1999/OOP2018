package lab4;

public class Account {

  private double balance;

  public Account(double amount) {
    this.setBalance(amount);
  }

  public Account() {

  }

  public void deposit(double amount) {

    this.balance += amount;
  }

  public boolean withdraw(double amount) {

    this.balance -= amount;
    return true;

  }

  public void showBalance() {
    System.out.println(this.getBalance());
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public static void main(String[] args) {

  }

}
