package bank;

import java.util.ArrayList;
import java.util.Iterator;

public class User {
	private String name;
	private int userID;
	private ArrayList<Account> accountsList = new ArrayList<Account>();

	@Override
	public boolean equals(Object object) {
		if (object==null || !(object instanceof User))
			return false;
		User user = (User) object;
		if (user.getUserID()==this.getUserID())
			return true;
		else {
			return false;
		}
	}

	public void addAccount(Account account) {
		if (accountsList.size() >= 10 || accountsList.contains(account)) {
			System.out.println("Khong them duoc tai khoan");
			return;
		}
		accountsList.add(account);
		System.out.println("Da add tai khoan " + account.getAccountID());
	}

	public void removeAcount(Account account) {
		if (accountsList.remove(account))
			System.out.println("Xoa tai khoan thanh cong");
		else {
			System.out.println("Tai khoan khong ton tai");
		}
	}

	public User(int userID) {
		this.userID = userID;
	}


	public String getName() {
		return name;
	}
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalBalance() {
		Iterator<Account> accountIterator = accountsList.iterator();
		double totalBalance = 0;
		while (accountIterator.hasNext()) {
			Account account = accountIterator.next();
			totalBalance += account.getBalance();
		}
		return totalBalance;
	}
	
	public void getAllInfo() {
		Iterator<Account> accountsIterator = accountsList.iterator();
		System.out.println("~~~~~~~~~~~~~~~~~~");	
		while (accountsIterator.hasNext()) {
			Account account=accountsIterator.next();
			System.out.println("So tai khoan:"+account.getAccountID());
			System.out.println("So du:"+account.getBalance());
			if (account instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount) account;
				System.out.println("Lai xuat:"+savingAccount.getInterest());
			}
			System.out.println("~~~~~~~~~~~~~~~~~~");	
		}
	}
}
