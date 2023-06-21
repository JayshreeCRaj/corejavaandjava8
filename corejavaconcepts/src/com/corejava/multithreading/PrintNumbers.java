package com.corejava.multithreading;

public class PrintNumbers {
	
	void print1To50() {
		for(int i=1; i<=50; i++) {
			System.out.print(i+",");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	void print50To1() {
		for(int i=50; i>=1; i--) {
			System.out.print(i+",");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
