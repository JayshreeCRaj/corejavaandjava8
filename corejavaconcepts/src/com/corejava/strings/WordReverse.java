package com.corejava.strings;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter any String");
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String result = "";
		for(int i=words.length-1; i>=0; i--) {
			result+=words[i]+" ";
		}
		System.out.println("Words Reversed in a sentence is: "+result);
	}

}
