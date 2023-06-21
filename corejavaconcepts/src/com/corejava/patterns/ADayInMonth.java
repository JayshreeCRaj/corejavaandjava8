package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ADayInMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any day number(dd) in a month");
		String str = sc.next();
		Pattern day = Pattern.compile("^([0][1-9]||[1][0-9]||[2][0-9]||[3][01])$");
		boolean b = CheckPattern.check(str, day);
		System.out.println(b);
		if(b==true)
			System.out.println("Day number Validates");

	}

}
