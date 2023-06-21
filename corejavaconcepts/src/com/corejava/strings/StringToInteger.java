package com.corejava.strings;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer");
		String str = sc.next();
		//int result = Integer.parseInt(str);
		int result = Integer.valueOf(str);
		System.out.println("The converted integer is: "+result);
	}

}
