package com.corejava.strings;

import java.util.Scanner;

public class RemoveGivenCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String input = sc.next();
		System.out.println("Enter character to remove from the input string");
		char searchChar = sc.next().charAt(0);
		String result="";
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) != searchChar ) {
				result+=input.charAt(i);
			}
		}
		System.out.println("After removing given character '"+searchChar+"' from the input string, the result will be: "+result);
	}

}
