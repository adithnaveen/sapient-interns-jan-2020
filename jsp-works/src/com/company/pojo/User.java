package com.company.pojo;

public class User {
	private String userName;
	private String city;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User(String userName, String city) {
		super();
		this.userName = userName;
		this.city = city;
	}

}
