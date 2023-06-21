package com.corejava.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" Everyone");
		System.out.println(sb);
		//Conversion from StringBuffer to String
		String s = sb.toString();
		System.out.println(s);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		sb.reverse();
		System.out.println(sb.delete(13, 16));
		
	}

}
