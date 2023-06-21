package com.corejava.collectiondemo;

import java.util.HashSet;

public class SetDemo {
	
	int i, j;
	
	public SetDemo(int i, int j) {
		super();
		this.i=i;
		this.j=j;
	}
	
	@Override
	public int hashCode() {
		
		System.out.println("Hashcode");
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash+=s2.hashCode();
		return hash;
		
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals");
		return (obj instanceof SetDemo && 
				i==((SetDemo)obj).i && 
				j == ((SetDemo)obj).j);
	}
	
	@Override 
	public String toString() {
		return "SetDemo [i=" + i + ", j=" + j +"]";
	}

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(new SetDemo(1,1));
		set.add(new SetDemo(1,1));
		set.add(new SetDemo(1,2));
		set.add(new SetDemo(2,1));
		set.add(new SetDemo(2,2));
		System.out.println(set);
		System.out.println(set.size());
		
		
		
	}

}
