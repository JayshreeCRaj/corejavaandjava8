package com.corejava.multithreading;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("In Run method");
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
	}
	
}
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("In main method");
		
		MyRunnable runnable = new MyRunnable();
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread1.join();
		thread2.start();
		
		System.out.println("End main method");

	}

}
