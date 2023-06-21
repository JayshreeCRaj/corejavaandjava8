package com.corejava.strings;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		String s1 = "Content";
		String s2 = "Content";
		
		System.out.println(s1==s2);//value and reference same
		System.out.println(s1.equals(s2));
		String s3 = new String("Test");
		String s4 = new String("Test");
		
	
		System.out.println(s3==s4);//compares value and reference value ie., hash code
		System.out.println(s3.equals(s4));//compares only values
		
	}

}
