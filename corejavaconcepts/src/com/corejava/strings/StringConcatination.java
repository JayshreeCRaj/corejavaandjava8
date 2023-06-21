package com.corejava.strings;

public class StringConcatination {

	public static void main(String[] args) {
		
		String s1 = "New";
		String s2 = " Content";
		String s3 = s1+s2; // Concats numeric, boolean, null and string values both
		String s4 = s1.concat(s2); // Concats string values only
		System.out.println(s3);
		System.out.println(s4);
		String s5 = s1+6;
		String s6 = s2 + true;
		String s7 = s1 + null;
		String s8 = s2 + 34.56;
		//String s9 = s1.concat(null);//throws NullPointerException
		//String s10= s2.concat(true); -> error
		//String s11= s2.concat(34); -> error
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		//System.out.println(s9);
		
		
	}

}
