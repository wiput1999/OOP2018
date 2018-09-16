package lab4;

public class Teller {

	public static void main(String[] args) {
		Account Teller1 = new Account(5000);
		Teller1.deposit(2000);
		Teller1.showBalance();
		Teller1.withdraw(4000);
		Teller1.showBalance();
		Teller1.withdraw(8000);
		Teller1.showBalance();
		Teller1.withdraw(2000);
		Teller1.showBalance();
	}

}
