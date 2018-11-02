package lab6;

import lab4.Account;

public class Customer {

    private String firstName;
    private String lastName;
    private Account acct;

    public Customer(String fName, String lName) {
        firstName = fName;
        lastName = lName;
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

    public Account getAccount() {
        return acct;
    }

    public void setAccount(Account acct) {
        this.acct = acct;
    }

}
