package com.zycus.part.three;

public class ProConApp {
	
	
	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		thread1.start();
		thread2.start();
		
		
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
