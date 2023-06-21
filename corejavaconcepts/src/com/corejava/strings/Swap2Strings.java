package com.corejava.strings;

import java.util.Scanner;

public class Swap2Strings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String first = sc.next();
		System.out.println("Enter string 2");
		String second = sc.next();
		first = first+second;
		second= first.substring(0,first.length()-second.length());
		first = first.substring(second.length());
		System.out.println("Strings after swapping is:");
		System.out.println("First String: "+first);
		System.out.println("Second String: "+second);
	}

}
