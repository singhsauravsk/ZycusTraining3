package com.zycus.part.two;

import java.io.Serializable;

public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1526974116528226177L;
	private String firstNAme;
	private String lastName;
	private int age;
	private int mobileNo;
	private String email;
	
	public Contact(String firstNAme, String lastName, int age, int mobileNo, String email) {
		super();
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.age = age;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	String getFirstNAme() {
		return firstNAme;
	}

	void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getMobileNo() {
		return mobileNo;
	}

	void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstNAme=" + firstNAme + ", lastName=" + lastName + ", age=" + age + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}
}
