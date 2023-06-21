package com.java8.streams;

import java.util.HashMap;
import java.util.Map;

public class MapSortingBykey {

	public static void main(String[] args) {
		
		Map<String, Integer> itemPrice = new HashMap<>();
		itemPrice.put("HP Laptop", 55000);
		itemPrice.put("Moto Edge 45", 29000);
		itemPrice.put("Samsung Galaxy", 68000);
		itemPrice.put("Apple Iphone 14", 95000);
		itemPrice.put("Vivo", 20000);
		
		itemPrice.entrySet().
		stream().
		sorted(Map.Entry.comparingByKey()).
		forEach(System.out::println);
		
		System.out.println("\nComparing based on Value");
		itemPrice.entrySet().
		stream().
		sorted(Map.Entry.comparingByValue()).
		forEach(System.out::println);
	}

}
