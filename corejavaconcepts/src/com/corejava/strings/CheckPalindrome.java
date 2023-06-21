package com.corejava.strings;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static String reverseString(String input) {
		String reversedString="";
		for(int i=input.length()-1; i>=0; i--)
			reversedString+=input.charAt(i);
		return reversedString;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String input = sc.next();
		String reversedString = reverseString(input);
		if(reversedString.equals(input)) {
			System.out.println("The input string "+input+" is a palindrome string");
		}
		else {
			System.out.println("The input string "+input+" is not a palindrome string");
		}
		
	}

}
