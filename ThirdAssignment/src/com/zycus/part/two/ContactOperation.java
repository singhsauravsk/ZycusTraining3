package com.zycus.part.two;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ContactOperation implements Runnable {
	private String fileName;
	protected static List <Contact> contactList = new LinkedList<>();
	
	public ContactOperation(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(Contact contact: contactList) {
				out.writeObject(contact);
				out.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
