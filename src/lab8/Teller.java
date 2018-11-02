package lab8;

import lab4.Account;

public class Teller {

    public static void main(String[] args) {
        CustomerAL cust = new CustomerAL("Wiput", "Pootong");
        Account acc1 = new Account(5000);
        Account acc2 = new Account(3000);

        cust.addAccount(acc1);
        cust.addAccount(acc2);

        Account test = cust.getAccount(1);

        test.showBalance();

        test.deposit(5000);

        test.showBalance();
    }
}
