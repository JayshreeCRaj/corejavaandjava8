package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an IP Address");
		String str = sc.next();
		Pattern day = Pattern.compile("^(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])$");
		boolean b = CheckPattern.check(str, day);
		System.out.println(b);
		if(b==true)
			System.out.println("IP Address Validates");

	}

}
