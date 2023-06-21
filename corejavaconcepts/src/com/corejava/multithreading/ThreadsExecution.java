package com.corejava.multithreading;

public class ThreadsExecution extends Thread {
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Run "+i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadsExecution te = new ThreadsExecution();
		te.start();
		System.out.println(te);
		
		for(int i=0; i<10; i++) {
			System.out.println("Before main thread creation "+i);
		}

	}

}
