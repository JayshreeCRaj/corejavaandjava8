package com.java8.consumers;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Spring boot");
		hm.put(2, "Java");
		hm.put(3, "Microservices");
		hm.put(4, "Unix");
		hm.put(5, "Python");
		
		hm.forEach((k,v) -> System.out.println(k + "->"+ v));
	}

}
