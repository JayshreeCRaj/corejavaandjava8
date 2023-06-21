package com.corejava.collectiondemo;

import java.util.HashMap;

class R{
	int i;
	R(int i){
		this.i=i;
	}
	public String toString() {
		return "i(=" + i + ")";
	}
}

class Q{
	int i;
	Q(int i){
		this.i=i;
	}
	public String toString() {
		return "(i=" +i+")";
	}
	public int hashCode() {
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj) {
		return (obj instanceof Q && i==((Q)obj).i);
	}
}
public class MapAndGenericObjects {

	public static void main(String[] args) {
		
		HashMap<Object, String> map = new HashMap<>();
		map.put(new R(9), "A");
		map.put(new R(9), "B");
		map.put(new Q(9), "C");
		map.put(new Q(9), "D");
		
		System.out.println(map);
	}

}
