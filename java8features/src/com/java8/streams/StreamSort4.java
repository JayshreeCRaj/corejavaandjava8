package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort4 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("unix");
		al.add("php");
		al.add("aws");
		
		List<String> result = al.stream().
		sorted().
		collect(Collectors.toList());
		System.out.println("Ascending Order: "+result);
		List<String> result1 = al.stream().
				sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Descending Order: "+result1);
	}
	

}
