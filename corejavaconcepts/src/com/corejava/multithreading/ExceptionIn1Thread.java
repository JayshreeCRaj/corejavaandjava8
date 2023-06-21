package com.corejava.multithreading;
//Exception in one thread doesn't effect the execution of another thread 
public class ExceptionIn1Thread extends Thread {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Run: "+i);
		}
	}
	public static void main(String[] args) {
		
		ExceptionIn1Thread et = new ExceptionIn1Thread();
		et.start();
		et.start();
		for(int i=1; i<=10; i++) {
			System.out.println("Main: "+i);
			if(i==3) {
				throw new ArithmeticException("Raised in main Thread"); 
			}
		}
		
	}

}
