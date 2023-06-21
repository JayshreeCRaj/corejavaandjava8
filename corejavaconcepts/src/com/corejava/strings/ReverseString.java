package com.corejava.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String result = "";
		for(int i = ch.length-1; i>=0; i--) {
			result+=ch[i];
		}
		
		System.out.println("Reversed String: "+result);
		
	}

}
