package com.corejava.multithreading;

import java.util.LinkedList;
import java.util.List;

class Producer implements Runnable{
	private List<Integer> manufactureQueue;
	private int maxSize=5;
	
	public Producer(List<Integer> manufactureQueue) {
		super();
		this.manufactureQueue= manufactureQueue;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				produce(i);
			}
			catch(Exception ie) {
				ie.printStackTrace();
			}
		}
		
	}
	private void produce(int i) throws InterruptedException {
		
		synchronized(manufactureQueue) {
			System.out.println("Producer is producing");
			while(manufactureQueue.size()==maxSize) {
				System.out.println("Queue is full");
				System.out.println("Producer is waiting for consumer to consume");
				System.out.println("Shared Queue size is: "+maxSize);
				manufactureQueue.wait();
			}
		}
		synchronized(manufactureQueue) {
			 	System.out.println("Produced: "+i);
				manufactureQueue.add(i);
				Thread.sleep((long)(Math.random()*1000));
				manufactureQueue.notify();
		}
		
	}
	
}

class Consumer implements Runnable{
	
	private List<Integer> manufactureQueue;
	public Consumer(List<Integer> manufactureQueue) {
		this.manufactureQueue=manufactureQueue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				consume();
				Thread.sleep(1000);
			}
			catch(Exception ie) {
				ie.printStackTrace();
			}
		}
		
	}

	private void consume() throws InterruptedException {
		synchronized(manufactureQueue) {
			while(manufactureQueue.size()==0) {
				System.out.println("Queue is empty");
				System.out.println("Consumer is waiting for producer to produce");
				System.out.println("Shared Queue size is: 0");
				manufactureQueue.wait();
			}
		}
		synchronized(manufactureQueue) {
			Thread.sleep((long)(Math.random()*2000));
			System.out.println("Consumed: "+manufactureQueue.remove(0));
			manufactureQueue.notify();
		}
		
	}
	
}
public class ProducerConsumer {
	
	public static void main(String[] args) {
		List<Integer> manufactureQueue = new LinkedList<Integer>();
		Producer producer = new Producer(manufactureQueue);
		Consumer consumer = new Consumer(manufactureQueue);
		
		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");
		
		producerThread.start();
		consumerThread.start();
	}

}
