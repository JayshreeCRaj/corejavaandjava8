package com.corejava.collectiondemo;

import java.util.TreeMap;

class D{
	int i;
	D(int i){
		this.i=i;
	}
	
	public String toString() {
		return "(i=" + i + ")";
	}
}
//throws ClassCastException
//Need to implement comparable or comparator interface
//Or override hashcode and equal method to sort and remove duplicates
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		map.put(new D(9), "abc");
		map.put(new D(90), "abc");
		map.put(new D(5), "abc");
		map.put(new D(5), "abc");
		map.put(new D(23), "abc");
		System.out.println(map);
	}

}
