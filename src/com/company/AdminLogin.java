package com.company;

public class AdminLogin {
	public void check(String username, String password) {
		if("admin".equals(username) && "admin".equals(password)) {
			System.out.println("LoginIn Successfull");
		}
		else {
			System.out.println("Invalid username or password");
		}
	}
}
