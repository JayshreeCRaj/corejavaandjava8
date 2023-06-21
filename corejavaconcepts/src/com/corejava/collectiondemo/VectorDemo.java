package com.corejava.collectiondemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		v1.add(20);
		v1.add(80);
		v1.add(50);
		v1.add(10);
		v1.add(90);
		
		System.out.println(v1);
		Enumeration en = v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
