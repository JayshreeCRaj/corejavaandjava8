package com.corejava.collectiondemo;

import java.util.TreeSet;

class A implements Comparable{
	int x;
	
	A(int x){
		System.out.println("Constructor");
		this.x=x;
	}

	@Override
	public int compareTo(Object o) {
		
		return x-((A)o).x;
	}
	
	@Override
	public String toString() {
		return "x="+x;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hashcode");
		final int prime =31;
		int result = 1;
		result = prime * result + x;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals");
		return (obj instanceof A) &&
				x==((A)obj).x;
		
	}
	
}
public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<A> set = new TreeSet<>();
		set.add(new A(10));
		set.add(new A(20));
		set.add(new A(10));
		set.add(new A(15));
		set.add(new A(5));
		set.add(new A(5));
		System.out.println(set);
	}

}
