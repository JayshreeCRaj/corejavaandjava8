package com.corejava.strings;

import java.util.Scanner;

public class ReverseStringRecurssively {
	
	public static void reverseString(String str) {
		if((str.length()==0)||(str==null)) {
			System.out.println(str);
		}
		else {
				System.out.print(str.charAt(str.length()-1));
				reverseString(str.substring(0,str.length()-1));
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ReverseStringRecurssively.reverseString(str);
		
	}

}
