package com.corejava.strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String first =  new String ();
		first = sc.next();
		System.out.println("Enter second string");
		String second = new String (); 
		second = sc.next();
		boolean result ;
		char[] firstArr = first.toLowerCase().toCharArray();
		char[] secondArr = second.toLowerCase().toCharArray();
		Arrays.sort(firstArr);
		Arrays.sort(secondArr);
		
		result = Arrays.equals(firstArr, secondArr); 
		if(result == true) {
			System.out.println("Given strings are anagrams");
		}
		else
			System.out.println("Given strings are not anagrams");
	}

}
