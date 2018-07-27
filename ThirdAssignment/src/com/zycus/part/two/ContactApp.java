package com.zycus.part.two;

public class ContactApp {
	
	public static void main(String[] args) {
		firstTenContacts();
		ContactOperation contactOperation1 = new ContactOperation("d:/data/contact/first1");
		ContactOperation contactOperation2 = new ContactOperation("d:/data/contact/first2");
		ContactOperation contactOperation3 = new ContactOperation("d:/data/contact/first3");
		
		Thread thread1 = new Thread(contactOperation1);
		Thread thread2 = new Thread(contactOperation2);
		Thread thread3 = new Thread(contactOperation3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//retrieveContact("d:/data/contact/first1.txt");
		//retrieveContact("d:/data/contact/first2.txt");
		//retrieveContact("d:/data/contact/first3.txt");
	}

	private static void firstTenContacts() {
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saura", "Kuma", 21, 777100, "sinsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saav", "mar", 21, 70770, "singhuravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
		ContactOperation.contactList.add(new Contact("Saurav", "Kumar", 21, 7077100, "singhsauravsk@gmail.com"));
	}
	
	/*private static void retrieveContact(String filePath) {
		System.out.println(filePath);
		List <Contact> contactList1 = new ArrayList<>();
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
			Object ob = in.readObject();
			
			while(ob != null) {
				contactList1.add((Contact)ob);
				ob = in.readObject();
			}
		}catch(EOFException e) {
			System.out.println("Currently there is no cards in database.");
		}catch(IOException e) { 
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Contact contact : contactList1) {
			System.out.println(contact.toString());
		}
	}*/
}
