package com.company;
import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your UserName here: ");
		String username = sc.next();
		
		System.out.println("Please Enter your password here: ");
		String password = sc.next();
		
		AdminLogin ad = new AdminLogin();
		ad.check(username,password);
	}

}
