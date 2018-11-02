package lab8;

import lab4.Account;

public class Customer {

    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount = 0;

    public Customer(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        acct = new Account[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public void addAccount(Account ac) {
        acct[numOfAccount] = ac;
        numOfAccount += 1;
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

}
