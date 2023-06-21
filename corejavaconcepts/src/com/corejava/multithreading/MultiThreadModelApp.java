package com.corejava.multithreading;

public class MultiThreadModelApp extends Thread {
	
	static PrintNumbers pn = new PrintNumbers();
	
	public void run() {
		pn.print50To1();
	}
	public static void main(String[] args) {
		
		MultiThreadModelApp mt = new MultiThreadModelApp();
		mt.start();
		
		long timeS = System.currentTimeMillis();
		
		pn.print1To50();
		
		long timeE = System.currentTimeMillis();
		
		System.out.println("\nTime taken to run both tasks: "+((timeE-timeS)/1000));

	}

}
