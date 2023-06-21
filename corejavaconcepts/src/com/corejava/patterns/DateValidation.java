package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any date in the format of dd-mm-yyyy or dd/mm/yyyy");
		String str = sc.next();
		Pattern day = Pattern.compile("^([0][1-9]||[1][0-9]||[2][0-9]||[3][01])(-|/)([0][1-9]||[1][012])(-|/)(\\d{4})$");
		boolean b = CheckPattern.check(str, day);
		System.out.println(b);
		if(b==true)
			System.out.println("Date Validates");

	}

}
