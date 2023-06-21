package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any password string");
		String str = sc.next();
		//System.out.println("Enter pattern to match");
		Pattern pattern= Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$&+,=?@#'.-^*%!])(?=\\S+).{8,}$") ;
		boolean b = CheckPattern.check(str, pattern);
		System.out.println(b);
		if(b==true)
		System.out.println("Password Validates");
	}

}
