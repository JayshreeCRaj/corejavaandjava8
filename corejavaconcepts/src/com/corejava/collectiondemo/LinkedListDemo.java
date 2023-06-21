package com.corejava.collectiondemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(40);
		list.add(60);
		list.add(30);
		list.add(80);
		list.add(20);
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println(list);
		list.addFirst(10);
		list.addLast(100);
		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		System.out.println(list);
		list.offerFirst(10);
		list.offerLast(100);
		System.out.println(list);
	}

}
