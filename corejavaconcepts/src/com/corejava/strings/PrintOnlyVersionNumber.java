package com.corejava.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintOnlyVersionNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter version string of apk file");
		String str = sc.next();
		//String sp = sc.next("[0-9]//.[0-9]//.[0-9]+-[0-9]+//.apk");
		//Pattern pattern = Pattern.compile(sp);
		int i = str.indexOf('-');
		System.out.println(str.subSequence(0, i));
		
		
	}

}

//String sp = "1.0.1-05102020.apk"