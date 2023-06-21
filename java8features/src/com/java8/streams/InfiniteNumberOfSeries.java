package com.java8.streams;

import java.util.stream.Stream;

public class InfiniteNumberOfSeries {

	public static void main(String[] args) {
		
		Stream.iterate(1, i->i+1).
		forEach(System.out::println);
	}

}
