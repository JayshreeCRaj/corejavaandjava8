package com.corejava.multithreading;

class MyRunnable1 implements Runnable{
	public void run() {
		testMethod();
	}
	
	public void testMethod() {
		System.out.println("Method entry point");
		//whenever we need to synchronize small part of a method or small piece of code, we should use synchronized block
		synchronized(this){
			for(int i=0; i<5; i++) {
				System.out.println(i+" "+Thread.currentThread().getName()+" is executing");
				try {
					Thread.sleep(500);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
		System.out.println("Thread execution completed");
	}
}
public class ThreadSynchronizedBlock {

	public static void main(String[] args) {
		MyRunnable1 mt = new MyRunnable1();
		
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		
		t1.start();
		t2.start();

	}

}
