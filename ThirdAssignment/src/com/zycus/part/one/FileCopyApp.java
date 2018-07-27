package com.zycus.part.one;

public class FileCopyApp {

	public static void main(String[] args) {
		FileCopy fileCopy = new FileCopy("d:/data/source/bobber.jpg", "d:/data/destination/bobber.png");
		
		Thread thread = new Thread(fileCopy);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
