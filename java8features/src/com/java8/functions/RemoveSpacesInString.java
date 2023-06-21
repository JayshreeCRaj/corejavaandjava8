package com.java8.functions;

import java.util.function.Function;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		
		Function<String, String> f = (str) -> str.replaceAll(" ", "");
		System.out.println(f.apply("  spaces in this string is removed  "));

	}

}
