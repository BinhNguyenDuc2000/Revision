package bank;

public class CheckingAccount extends Account {

	private SavingAccount linkedAccount;
	
	public CheckingAccount(SavingAccount account, int accountID, int userID,double balance) {
		super(accountID, userID, balance);
		if (account==null || !(account instanceof SavingAccount)){
			System.out.println("Account is not valid");
		}
		else {
			setLinkedAccount(account);
		}
	}
	
	public void setLinkedAccount(SavingAccount account) {
		if (account.getUserID()==getUserID()) {
			linkedAccount=account;
			System.out.println("Da them duoc tai khoan lien ket");
		}
		else {
			System.out.println("Khong them duoc tai khoan lien ket");
		}
			
	}
	
	public void withdraw(double amount) {
		double balance=getBalance();
		//Neu tai khoan van lai co du tien thi rut truc tiep tu day
		if (balance>=amount) {
			System.out.println("Da rut duoc tien");
			setBalance(balance-amount);
		}
		else {
			if (linkedAccount==null) {
				System.out.println("Khong rut duoc tien");
			}
			else {
				double linkedAccountBalance = linkedAccount.getBalance();
				if (balance+linkedAccountBalance>=amount) {
					//Tai khoan van lai bi tru truoc va ve 0
					setBalance(0);
					//Tai khoan tiet kiem bi tru di mot khoang bang amount-balance
					linkedAccount.setBalance(linkedAccountBalance-amount+balance);
					System.out.println("Da rut duoc tien");
				}
				else {
					System.out.println("Khong rut duoc tien");
				}
					
			}
		}
		
	}
}
