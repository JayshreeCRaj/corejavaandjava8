package com.corejava.multithreading;

public class SingleThreadModelApp {

	public static void main(String[] args) {
		
		PrintNumbers pn = new PrintNumbers();
		
		long timeS = System.currentTimeMillis();
		
		pn.print1To50();
		
		System.out.println();
		
		pn.print50To1();
		
		long timeE = System.currentTimeMillis();
		
		System.out.println("\nTime taken to run both tasks is: "+((timeE-timeS)/1000));
	}

}
