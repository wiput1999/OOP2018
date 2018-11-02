package lab8;

import java.util.ArrayList;
import lab4.Account;

public class CustomerAL {

    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount = 0;

    public CustomerAL(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        acct = new ArrayList();
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
        return (Account) acct.get(index);
    }

    public void addAccount(Account ac) {
        acct.add(ac);
        numOfAccount += 1;
    }

    public int getNumOfAccount() {
        return acct.size();
    }

}
