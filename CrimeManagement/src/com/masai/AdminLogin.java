package com.masai;

public class AdminLogin {
	public boolean check(String username, String password) {
		if("admin".equals(username) && "admin".equals(password)) {
			System.out.println("LoginIn Successfull");
			return true;
		}
		else {
			System.out.println("Invalid username or password");
			return false;
		}
	}
}
