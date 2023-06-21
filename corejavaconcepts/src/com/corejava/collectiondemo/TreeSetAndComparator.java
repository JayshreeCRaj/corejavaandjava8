package com.corejava.collectiondemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

class P{
	int i, j;
	
	public P(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i +" , " + j + ")";
	}
	
	static class A implements Comparator{
		@Override 
		public int compare(Object o1, Object o2) {
			P obj1 = (P)o1;
			P obj2 = (P)o2;
			return obj1.i-obj2.i;
			
		}
	}
	static class B implements Comparator{
		@Override 
		public int compare(Object o1, Object o2) {
			P obj1 = (P)o1;
			P obj2 = (P)o2;
			return obj1.j-obj2.j;
			
		}
	}
}
public class TreeSetAndComparator {

	public static void main(String[] args) {

		TreeSet set1 = new TreeSet(new P.A());
		TreeSet set2 = new TreeSet(new P.B());
		
		set1.add(new P(1,0));
		set1.add(new P(2,1));
		set1.add(new P(4,6));
		set1.add(new P(0,4));
		set1.add(new P(3,2));
		set1.add(new P(5,5));
		System.out.println(set1);
		
		set2.add(new P(1,0));
		set2.add(new P(2,1));
		set2.add(new P(4,6));
		set2.add(new P(0,4));
		set2.add(new P(3,2));
		set2.add(new P(5,5));
		System.out.println(set2);
		
		

	}

}
