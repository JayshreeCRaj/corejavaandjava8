package com.java8.streams;

import java.util.ArrayList;

public class StreamFilterCount3 {

	public static void main(String[] args) {
			
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("unix");
		al.add("php");
		al.add("python");
		
		long count = al.stream().
				filter(str -> str.length() == 4).
				count();
		System.out.println(count);
	}
		
}
