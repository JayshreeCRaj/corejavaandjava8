package com.corejava.patterns;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String s1 = sc.nextLine();
		//System.out.println("Enter pattern to match");
		//To match digits
		//Pattern p1 = Pattern.compile("\\d+"); 
		//To match white spaces
		//Pattern p1 = Pattern.compile("\\s");
		//To match non digits
		//Pattern p1 = Pattern.compile("\\D");
		//To match alphabet followed by digit
		//Pattern p1 = Pattern.compile("[a-z][0-9]");
		//To match words same as [a-zA-Z0-9_]+
		Pattern p1 = Pattern.compile("\\w+");
		findMatch(s1, p1);
	}

	private static void findMatch(String s1, Pattern p1) {
		Matcher m1 = p1.matcher(s1);
		while(m1.find()) {
			System.out.print(m1.group()+"\t@\t"+m1.start());
			System.out.println("\n------");
		}
	}

}
