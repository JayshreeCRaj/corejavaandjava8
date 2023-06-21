package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("unix");
		al.add("php");
		al.add("python");
		
		List<String> result = al.stream().
		map(str -> str.toUpperCase()).
		collect(Collectors.toList());
		
		System.out.println(result);
		
		

	}

}
