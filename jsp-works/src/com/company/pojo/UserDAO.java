package com.company.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	static List<User> users;
	static {
		users = new ArrayList<User>();
		users.add(new User("Nikit", "Bengaluru"));
		users.add(new User("Suraj", "Bengaluru"));
		users.add(new User("Shivanandan", "Delhi"));
		users.add(new User("Prerana", "Mysuru"));
	}

	public boolean validateUser(User user) {
		System.out.println(user);
		// you have to connect to DB
		return user.getUserName().equals("kumar");
	}

	public List<User> getUsers() {
		return users;
	}

}
