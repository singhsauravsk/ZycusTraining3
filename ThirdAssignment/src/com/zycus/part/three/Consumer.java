package com.zycus.part.three;

public class Consumer extends BaseProCon implements Runnable {
	
	@Override
	public void run() {
		/*waitToDelete();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Deleting 100 strings from stack");
		
		for(int i = 0; i < 100; i++) {
			
			if(!stack.empty()) {
				String deleted = stack.pop();
				System.out.println("\""+deleted+"\""+" is deleted");
			}
			else {
				System.out.println("Stack is empty");
			}
		}
		notifyProducer();*/
		System.out.println(Thread.currentThread().getName());
		System.out.println("Deleting 100 strings from stack");
		
		while(true) {
			
			synchronized (stack) {
				
				if(i == 0) {
				
					try {
						stack.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {
				
			
					if(!stack.empty()) {
 						i--;
						String deleted = stack.pop();
						System.out.println("\""+deleted+"\""+" is deleted");
					}	
				}
				
				if(i == BUFFER_SIZE-1) {
					stack.notify();
				}
			}
		}
	}
}
