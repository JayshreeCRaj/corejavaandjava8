package com.java8.consumers;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Basket ball");
		al.add("Hand ball");
		al.add("Foot ball");
		al.add("Volley ball");
		al.add("Throw ball");
		
		al.forEach(s -> System.out.println(s));

	}

}
