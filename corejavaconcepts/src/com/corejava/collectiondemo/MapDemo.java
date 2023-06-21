package com.corejava.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
		map.put(21,  12);
		map.put(21,  93);//replaces the old value with new value
		map.put(25,  45);
		map.put(24, 18);
		map.put(30, 151);
		map.put(38,  89);
		map.put(15,  25);
		
		System.out.println(map);
	}

}
