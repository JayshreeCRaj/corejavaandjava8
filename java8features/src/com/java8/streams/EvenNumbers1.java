package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers1 {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			alist.add(i);
		}
		List<Integer> result = alist.stream().
		filter(num -> num%2 == 0).collect(Collectors.toList());
		System.out.println(result);
	}

}
