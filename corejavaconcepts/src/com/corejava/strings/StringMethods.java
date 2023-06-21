package com.corejava.strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Hi, Good Morning, Today's date is 09-04-2023";
		int i = s1.indexOf('0');
		System.out.println(i);
		int j = s1.indexOf("date");
		System.out.println(j);
		
		char ch = s1.charAt(38);
		System.out.println(ch);
		
		char[] ch1 = s1.toCharArray();
		for(char c : ch1) {
			System.out.print(c);
		}
		
		System.out.println("\n"+s1.substring(18));
		System.out.println(s1.subSequence(0, 16));
		System.out.println(s1.contains("is"));
		System.out.println(s1.contentEquals("is"));
		System.out.println(s1.toUpperCase());
		CharSequence cs = s1.subSequence(0, 16);
		String s2 = (String) cs;
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.endsWith("23"));
		System.out.println(s1.lastIndexOf("0"));
		System.out.println(s1.codePointAt(18));
		System.out.println(s1.codePointBefore(19));
		System.out.println(s1.codePointCount(17, 21));
		String s3 = "   learning is fun  ";
		System.out.println(s3.trim());
		System.out.println(s3.strip());
		System.out.println(s3.stripLeading());
		System.out.println(s3.stripTrailing());
		String[]  s4 = s3.split(" ");
		for(String s : s4) {
			System.out.println(s);
			System.out.println(s1.replace('o', 'O'));
			System.out.println(s1.replaceAll("od", "OD"));
			
			String s5 = "New Content";
			String s6 = "New ";
			String s7 = s6 + "Content";
			System.out.println(s5==s7);
			System.out.println(s5);
			System.out.println(s7);
			System.out.println(s5.equals(s7));
			System.out.println(s5.hashCode());
			System.out.println(s7.hashCode());
		}
	
	}

}
