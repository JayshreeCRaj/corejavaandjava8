package com.corejava.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToString {

	public static void main(String[] args) {
		
		String[] str = {"Hey", "Hi", "Hello", "Good","Morning"};
		String result = Arrays.toString(str);
		System.out.println(result);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length; i++) {
			sb.append(str[i]);
		}
		System.out.println(sb.toString());
		String strJoin= Arrays.stream(str).collect(Collectors.joining());
		System.out.println(strJoin);
	}

}
