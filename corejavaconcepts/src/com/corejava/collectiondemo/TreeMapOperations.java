package com.corejava.collectiondemo;

import java.util.TreeMap;

public class TreeMapOperations {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
		map.put(34, "A");
		map.put(21, "B");
		map.put(93, "C");
		map.put(66, "D");
		map.put(78, "F");
		System.out.println(map);
		
		System.out.println(map.ceilingKey(40));
		System.out.println(map.floorKey(40));
		System.out.println(map.headMap(65));
		System.out.println(map.tailMap(78));
		System.out.println(map.headMap(66, true));
		System.out.println(map.tailMap(78, true));
		
	}

}
