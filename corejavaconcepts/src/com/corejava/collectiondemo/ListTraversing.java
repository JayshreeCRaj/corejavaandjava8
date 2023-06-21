package com.corejava.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTraversing {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(9);
		list.add(3);
		
		System.out.println(list);
		System.out.println("--------");
		System.out.println("Using Iterator");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n--------");
		System.out.println("Using list iterator");
		System.out.println("Forward direction");
		ListIterator lit = list.listIterator();
		lit.add(12);//Can add elements to the list iterator but not to the list object while iterating 
		while(lit.hasNext()) {
			//list.add(5); throws ConcurrentModificationException
			System.out.print(lit.next()+" ");
		}
		System.out.println("\n---------");
		System.out.println("Backward direction");
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+" ");
		}
	}
}
