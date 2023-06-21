package com.java8.streams;

import java.util.stream.Stream;

public class ConversionIntegerToStream {

	public static void main(String[] args) {
		
		Integer[] arr = {36, 89, 67, 40, 28, 19, 4};
		Stream<Integer> numbers = Stream.of(arr);
		//numbers.forEach(num -> System.out.println(num));
		numbers.forEach(System.out::println);
	}

}
