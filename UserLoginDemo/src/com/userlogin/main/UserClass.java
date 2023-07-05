package com.userlogin.main;

public class UserClass {
	String username, password, status="enabled";

	
	public UserClass() {
		super();
	}

	public UserClass(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	String login() {
		
		return status;
	}

}
