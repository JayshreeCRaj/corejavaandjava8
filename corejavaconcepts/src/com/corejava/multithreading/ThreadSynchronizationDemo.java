package com.corejava.multithreading;


class MyRunnable2 implements Runnable{
	public void run() {
		testMethod();
	}

	public synchronized void testMethod() {
		for(int i=0; i<15; i++) {
			System.out.println(i+" "+Thread.currentThread().getName()+" is executing");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}
}
public class ThreadSynchronizationDemo {

	public static void main(String[] args) {
		MyRunnable2 obj = new MyRunnable2();
		Thread t1 = new Thread(obj, "Thread-1");
		Thread t2 = new Thread(obj, "Thread-2");
		t1.start();
		t2.start();
	}

}
