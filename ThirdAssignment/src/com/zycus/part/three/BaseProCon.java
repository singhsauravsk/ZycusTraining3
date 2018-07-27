package com.zycus.part.three;

import java.util.Stack;

public class BaseProCon {
	protected static Stack <String> stack = new Stack<>();
	protected static  boolean lock = true;
	protected static Integer i = 0;
	protected static final Integer BUFFER_SIZE = 100;
	
	/*protected void waitToWrite() {
		
		while(lock != true) {
			
		}
	}
	
	protected void waitToDelete() {
		
		while(lock != false) {
			
		}
	}
	
	protected void notifyConsumer() {
		lock = false;
	}
	
	protected void notifyProducer() {
		lock = true;
	}*/
}
