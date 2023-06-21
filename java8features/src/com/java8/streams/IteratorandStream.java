package com.java8.streams;

import java.util.stream.Stream;

public class IteratorandStream {

	public static void main(String[] args) {
		
		//Stream.iterate(1, num->num+2).
		//forEach(System.out::println);
		
		Stream.iterate(1, num->num+1).
		filter(i -> i%4 ==0).limit(5).
		forEach(System.out::println);

	}

}
