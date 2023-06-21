package com.corejava.collectiondemo;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet set =  new TreeSet();
		set.add(0);
		set.add(9);
		set.add(90);
		set.add(50);
		set.add(40);
		//set.add("abc");
		System.out.println(set);
		
		TreeSet<Double> set1 = new TreeSet<Double>(Collections.reverseOrder());
		set1.add(9.9);
		set1.add(1.9);
		set1.add(4.5);
		set1.add(6.8);
		set1.add(7.7);
		set1.add(2.5);
		set1.add(4.3);
		set1.add(5.6);
		System.out.println(set1);
	}

}
