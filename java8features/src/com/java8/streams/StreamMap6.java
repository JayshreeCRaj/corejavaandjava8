package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(58);
		al.add(63);
		al.add(78);
		al.add(45);
		al.add(23);
		al.add(11);
		
		List<Integer> result = al.stream().map(num -> num+10).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> result1 = al.stream().filter(num -> num>50).map(num -> num+10).collect(Collectors.toList());
		System.out.println(result1);
	}

}
