package com.zycus.part.three;

public class Producer extends BaseProCon implements Runnable {
	
	@Override
	public void run() {
		/*waitToWrite();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Writing 100 strings to stack");
		
		for(Integer i = 0; i < 100; i++) {
			stack.push("Alpha"+i.toString());
		
		}
		notifyConsumer();*/
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Writing 100 strings from stack");
		
		while(true) {
			
			synchronized (stack) {
				
				if(i == BUFFER_SIZE) {
				
					try {
						stack.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {
					stack.push("Alpha"+i.toString());
					i++;
				}
			
				if(i == 1) {
					stack.notify();
				}
			}
		}
	}
}
