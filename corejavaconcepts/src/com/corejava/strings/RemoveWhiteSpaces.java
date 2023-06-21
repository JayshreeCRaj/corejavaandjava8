package com.corejava.strings;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string with whitespaces");
		String str =  sc.nextLine();
		char[] ch = str.toCharArray();
		int j=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] != ' ') {
				ch[j]=ch[i];
				j++;
			}
		}
		str= (String) String.valueOf(ch).subSequence(0, j);
		System.out.println(str);
	}

}
