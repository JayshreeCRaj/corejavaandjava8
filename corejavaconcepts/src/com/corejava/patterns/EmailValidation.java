package com.corejava.patterns;

import java.util.Scanner;

public class EmailValidation {
	
	public static boolean check(String str, String pattern) {
		Boolean b = str.matches( pattern);
		return b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any email");
		String str = sc.next();
		//System.out.println("Enter pattern to match");
		String pattern= "^[a-zA-Z][a-zA-Z0-9]+@[a-z]{1,8}\\.[a-z]{1,3}$";
		boolean b = check(str, pattern);
		System.out.println(b);
		if(b==true)
		System.out.println("Email Validates");
	}

}
