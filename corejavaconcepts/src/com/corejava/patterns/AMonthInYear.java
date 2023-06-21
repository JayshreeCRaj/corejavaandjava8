package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AMonthInYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any month number(mm) in year");
		String str = sc.next();
		Pattern month = Pattern.compile("^([0][1-9]||[1][012])$");
		boolean b = CheckPattern.check(str, month);
		System.out.println(b);
		if(b==true)
			System.out.println("Month number Validates");

	}

}
