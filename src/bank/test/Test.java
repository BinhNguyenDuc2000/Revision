package bank.test;

import bank.Account;
import bank.Bank;
import bank.CheckingAccount;
import bank.SavingAccount;
import bank.User;

public class Test {
	public static void main(String[] args) {
		Bank bank = new Bank();
		User user = new User(0);
		Account account1 = new SavingAccount(10, 1, 0, 100);
		Account account2 = new CheckingAccount((SavingAccount)account1, 2, 0, 100);
		user.addAccount(account1);
		user.addAccount(account2);
		bank.addUser(user);
		user.getAllInfo();
		account1.deposit(100);
		account2.deposit(200);
		user.getAllInfo();
		account1.withdraw(100);
		account1.withdraw(10000);
		user.getAllInfo();
		account2.withdraw(300);
		user.getAllInfo();
		account2.withdraw(100);
		user.getAllInfo();
		account2.withdraw(5);
		user.getAllInfo();
	}

}
