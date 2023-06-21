package com.corejava.multithreading;

//3 Ways to create a thread
//by extending Thread class
//by implementing Runnable interface
//by using Callable interface
public class CreateThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("New Thread Created");
	}
	public static void main(String[] args) {

		Thread thread = new Thread();
		thread.start();
		System.out.println(thread);
		
		CreateThread thread2 = new CreateThread();
		thread2.start();
		//thread2.start();//Throws IllegalThreadstate exception as the thread is already in running state and not in dead state.
	
	}

}
