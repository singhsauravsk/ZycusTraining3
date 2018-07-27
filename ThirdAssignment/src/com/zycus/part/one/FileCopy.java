package com.zycus.part.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopy implements Runnable {
	private String source;
	private String destination;
	private byte[] store =  new byte[1000];
	
	public FileCopy(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
		
	}

	@Override
	public void run() {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(source);
			System.out.println("Source file is found");
			FileOutputStream fileOutputStream = new FileOutputStream(destination);
			System.out.println("Preparing to copy");
			int len;
			
			while((len=fileInputStream.read(store))!=-1){
				fileOutputStream.write(store, 0, len);
			}
			System.out.println("Copied Successfully");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
