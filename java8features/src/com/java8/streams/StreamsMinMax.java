package com.java8.streams;

import java.util.ArrayList;

public class StreamsMinMax {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			alist.add(i);
		}
		
		Integer result= alist.stream().
		min((s1,s2)->s1.compareTo(s2)).
		get();
		
		System.out.println("Min: "+result);
		
		Integer result1= alist.stream().
				max((s1,s2)->s1.compareTo(s2)).
				get();
				
				System.out.println("Max: "+result1);


	}

}
