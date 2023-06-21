package com.corejava.multithreading;

public class DeadlockDemo {

	public static void main(String[] args) throws InterruptedException {
		final String resource1 = "KeyBoard";
		final String resource2 = "Monitor";
		
		Thread t1 = new Thread(()->{
			//t1 locked resource 1 and then tries to lock resource 2
			synchronized(resource1) {
				System.out.println("Thread 1 locked Resource 1");
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException ie) {
					ie.printStackTrace();				
				}
				//t1 needs to wait till t2 releases resource 2
				synchronized(resource2) {
					System.out.println("Thread 1 locked Resource 2");
				}
			}
		});
		
		Thread t2 = new Thread() {
		//t2 locked resource 2 and then tries to lock resource 1
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2 locked Resource 2");
					try {
						Thread.sleep(100);
					}
					catch(InterruptedException ie) {
						ie.printStackTrace();
					}
					//t2 needs to wait till t1 releases resource 1
					synchronized(resource1) {
						System.out.println("Thread 2 locked Resource 1");
					}
				}
			}
		
		};
		
		t1.start();
		//can overcome deadlock by using calling join() on thread t1
		//t1.join();
		t2.start();

	}

}
