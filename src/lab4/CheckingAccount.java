package lab4;

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
			} else
				balance -= amount;
			return true;
		}
		return false;
	}

	public void showCredit() {
		System.out.println(credit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
