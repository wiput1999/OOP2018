package lab6;

import lab4.Account;
import lab4.CheckingAccount;

public class Teller2 {

  public static void main(String[] args) {
    Account myAccount;
    myAccount = new CheckingAccount(4000, 500);

    Customer cust;
    cust = new Customer("Somchai", "Sommut");

    cust.setAccount(myAccount);

    cust.getAccount().withdraw(4300);

    cust.getAccount().showBalance();

    ((CheckingAccount) cust.getAccount()).showCredit();

    cust.getAccount().deposit(4200);

    cust.getAccount().showBalance();

    ((CheckingAccount) cust.getAccount()).showCredit();

    System.out.printf("%s %s\n", cust.getFirstName(), cust.getLastName());

  }

}
