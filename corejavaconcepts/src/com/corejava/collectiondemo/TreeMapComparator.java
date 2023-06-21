package com.corejava.collectiondemo;

import java.util.Comparator;
import java.util.TreeMap;

class F {
	
	int i, j;
	public F(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	@Override
	public String toString() {
		return "[i="+i+", j="+j+"]";
	}
	static class CompareValuei implements Comparator{
		@Override
		public int compare(Object ob1, Object ob2) {
			return ((F)ob1).i-((F)ob2).i;
		}
	}
	static class CompareValuej implements Comparator{
		@Override
		public int compare(Object ob1, Object ob2) {
			return ((F)ob1).j-((F)ob2).j;
		}
	}
}
public class TreeMapComparator {

	public static void main(String[] args) {
		TreeMap map1 = new TreeMap(new F.CompareValuei());
		TreeMap map2 = new TreeMap(new F.CompareValuej());
		
		map1.put(new F(1,2), "A");
		map1.put(new F(5,9), "B");
		map1.put(new F(3,4), "C");
		map1.put(new F(8,1), "D");
		map1.put(new F(6,3), "F");
		System.out.println(map1);
		
		map2.put(new F(1,2), "A");
		map2.put(new F(5,9), "B");
		map2.put(new F(3,4), "C");
		map2.put(new F(8,1), "D");
		map2.put(new F(6,3), "F");
		System.out.println(map2);
		
	}

}
