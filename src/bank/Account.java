package bank;

public abstract class  Account {
	private int accountID;
	private double balance;
	private int userID;
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Account(int accountID, int userID, double balance) {
		this.accountID = accountID;
		this.balance = balance;
		this.userID = userID;
	}
	
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Gui tien vao tai khoan
	public void deposit(double amount) {
		double balance = getBalance();
		setBalance(balance+amount);
		System.out.println("Da chuyen them tien vao tai khoan");
		System.out.println("So du moi:"+getBalance());
	}
	
	//Rut tien ra 
	public abstract void withdraw(double amount);
	
	@Override 
	public boolean equals(Object object) {
		if (!(object instanceof Account))
			return false;
		Account account = (Account) object;
		return (this.accountID==account.getAccountID());
	}
}
