package lab9;

public class Teller {

    public static void main(String[] args) {
        Customer cust = new Customer("Wiput", "Pootong");
        CheckingAccount acc1 = new CheckingAccount(5000, 500);
        CheckingAccount acc2 = new CheckingAccount(3000, 500);

        cust.addAccount(acc1);
        cust.addAccount(acc2);

        CheckingAccount test = cust.getAccount(1);

        test.showBalance();

        test.withdraw(100000);

        test.showBalance();
    }
}
