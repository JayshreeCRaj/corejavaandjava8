package com.corejava.collectiondemo;

import java.util.TreeMap;

class E implements Comparable{
	int i;
	 public E(int i) {
		 super();
		 this.i=i;
	 }
	 
	 @Override 
	 public String toString() {
		 return "(i="+i+")";
	 }
	 
	 @Override
	 public int compareTo(Object obj) {
		 return i-((E)obj).i;
	 }
}
public class TreeMapComparable {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		map.put(new E(9), "abc");
		map.put(new E(91), "def");
		map.put(new E(19), "ghi");
		map.put(new E(29), "jkl");
		System.out.println(map);
		
	}

}
