package bank;

public class SavingAccount extends Account {
	private double interest;
	public SavingAccount(double interest, int accountID, int userID, double balance) {
		super(accountID, userID, balance);
		this.interest = interest;
	}

	
	public double getInterest() {
		return interest;
	}



	public void setInterest(double interest) {
		this.interest = interest;
	}

	

	


	public void withdraw(double amount) {
		double balance = getBalance();
		if (balance<amount) {
			System.out.println("Khong rut duoc tien");
		}
		else {
			setBalance(balance-amount);
			System.out.println("Da rut duoc tien");
		}
	}

}
