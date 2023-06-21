package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		String[] str =  {"java", "python","unix", "php"};
		Stream<String> streams = Arrays.stream(str);
		List<String> result = streams.sorted().collect(Collectors.toList());
		System.out.println(result);
	}

}
