package com.java8.functions;

import java.util.function.Function;

public class FindLegthOfString {

	public static void main(String[] args) {
		
		Function<String, Integer> f = (str) -> str.length();
		System.out.println(f.apply("content"));

	}

}
