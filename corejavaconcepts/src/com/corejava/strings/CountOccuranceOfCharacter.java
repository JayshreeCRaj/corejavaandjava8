package com.corejava.strings;

import java.util.Scanner;

public class CountOccuranceOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String input = sc.next();
		System.out.println("Enter character to search in input string");
		char searchChar = sc.next().charAt(0);
		int count = 0;
		for(int i=0; i<input.length()-1; i++) {
			if(input.charAt(i) == searchChar ) {
				count++;
			}
		}
		System.out.println("Count of occurance of character "+searchChar+" is: "+count);
	}

}
