package com.corejava.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence");
		String sentence = sc.nextLine();
		String[] stringArray = sentence.split(" ");
		System.out.println("The count of words in a given string sentence is: "+stringArray.length);
		
		if(!sentence.isEmpty()) {
			StringTokenizer stringTokenizer = new StringTokenizer(sentence);
			System.out.println("The count of words using StringTokenizer in a given string sentence is: "+stringTokenizer.countTokens());
		}
	}

}
