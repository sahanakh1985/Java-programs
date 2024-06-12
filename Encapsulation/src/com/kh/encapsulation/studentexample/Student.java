package com.kh.encapsulation.studentexample;

public class Student {
	private int age;
	private String name;
	private long phoneNo;

	// Alt + Shift + S + R ->generate getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}
