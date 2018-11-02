package lab8;

import lab4.Account;
import lab4.CheckingAccount;

public class Bank {

    private final Account[] acct;
    private int numAcct = 0;

    Bank() {
        acct = new Account[10];
    }

    public void addAccount(Account ac) {
        acct[numAcct] = ac;
        numAcct += 1;
    }

    public Account getAccoubt(int index) {
        return acct[index];
    }

    public int getNumAccount() {
        return numAcct;
    }

}
