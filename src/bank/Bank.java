package bank;

import java.util.ArrayList;

public class Bank {

	private ArrayList<User> usersList = new ArrayList<User>();

	public ArrayList<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(ArrayList<User> usersList) {
		this.usersList = usersList;
	}
	
	public void addUser(User user) {
		if (usersList.contains(user)) {
			System.out.println("Khong them duoc user:"+user.getUserID());
		}
		else {
			usersList.add(user);
		}
	}
	
	
}

