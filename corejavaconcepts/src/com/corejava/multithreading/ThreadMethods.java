package com.corejava.multithreading;

public class ThreadMethods {
	
	static{
		System.out.println("In Static block");
		Thread th = Thread.currentThread();
		System.out.println("Static block executing in "+th.getName()+" thread\n");
	}

	public static void main(String[] args) {
		
		System.out.println("In main thread");
		
		Thread th = Thread.currentThread();
		
		System.out.println("Original name and priority of thread");
		System.out.println("Current thread name: "+th.getName());
		System.out.println("Current thread priority: "+th.getPriority());
		
		th.setName("My Thread");
		th.setPriority(7);
		
		System.out.println("\nModified name and priority of thread");
		System.out.println("Current thread name: "+th.getName());
		System.out.println("Current thread priority: "+th.getPriority());
		
	}

}
