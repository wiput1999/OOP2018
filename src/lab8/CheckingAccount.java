package lab8;

import lab4.Account;

public class CheckingAccount extends Account {

    private double credit;
    protected double balance;

    public CheckingAccount(double amount, double credit) {
        balance = amount;
        this.credit = credit;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((credit + balance) - amount >= 0) {
            if (balance < amount) {
                credit -= (amount - balance);
                balance = 0;
            } else {
                balance -= amount;
            }
            return true;
        }
        return false;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    public void showCredit() {
        System.out.println(credit);
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
