package com.corejava.multithreading;

class MyRunnable3 implements Runnable{
	@Override
	public void run() {
		System.out.println("In run method > is alive ="+
		Thread.currentThread().isAlive());
	}
}
public class IsAliveTest {

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Thread(new MyRunnable3(), "thread-1");
		System.out.println("Before starting thread > is alive ="+th.isAlive());
		th.start();
		Thread.sleep(1000);//Optional, delay to ensure the thread is executed.
		System.out.println("After completion of run method > is alive ="+th.isAlive());
			
	}

}
