package com.java8.streams;

import java.util.ArrayList;

public class StreamsAllMatch {

	public static void main(String[] args) {ArrayList<String> al = new ArrayList<String>();
	al.add("java");
	al.add("unix");
	al.add("php");
	al.add("python");
	
	boolean result = al.stream().anyMatch(str -> str.contains("java"));
	System.out.println(result);
	
	boolean result1 = al.stream().allMatch(str -> str.contains("p"));
	System.out.println(result1);
	
	boolean result2 = al.stream().noneMatch(str -> str.contains("z"));
	System.out.println(result2);

	}

}
