package com.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcurrentModificationException {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(45);
		list.add(90);
		list.add(35);
		list.add(67);
		list.add(85);
		
		Iterator it = list.iterator();
		//Cannot add elements while iterating
		//list.add(5);
		while(it.hasNext()) {
			//list.add(5);
			System.out.println(it.next());
			//list.add(5);
		}
		System.out.println(list);
		list.add(5); //can add elements after iterating through the list
		System.out.println(list);
	}

}
