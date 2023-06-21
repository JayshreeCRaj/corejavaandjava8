package com.corejava.multithreading;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("In Run");
		
	}
	
}
public class CreateThreadUsingRunnable {

	public static void main(String[] args) {
		
		System.out.println("In main thread");
		
		MyThread mt = new MyThread();
		
		Thread th1 = new Thread();
		th1.start();
		System.out.println("Th1 =>" + th1);
		
		Thread th2 = new Thread(mt);
		th2.start();
		System.out.println("Th2 =>" + th2);
		
		Thread th3 = new Thread(mt, "MyThreadName");
		th3.start();
		System.out.println("Th3 =>" + th3);
		

	}

}
