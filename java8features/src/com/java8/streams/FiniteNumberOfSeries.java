package com.java8.streams;

import java.util.stream.Stream;

public class FiniteNumberOfSeries {

	public static void main(String[] args) {
		
		Stream.iterate(1,  i->i+1)
		.filter(i->i%2!=0)
		.limit(10)
		.forEach(System.out::println);
	}

}
