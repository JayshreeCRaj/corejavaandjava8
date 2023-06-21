package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number with country code");
		String str = sc.next();
		Pattern number = Pattern.compile("^\\+[0-9]{1,3}[0-9]{6,10}$");
		boolean b = CheckPattern.check(str, number);
		System.out.println(b);
		if(b==true)
			System.out.println("Phone number Validates");
	}

}
