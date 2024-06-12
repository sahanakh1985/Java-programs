package com.kh.encapsulation.studentexample;

public class Runner {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(37);
		s.setName("Sahana");
		s.setPhoneNo(7487612345L);

		System.out.println(s.getAge());// 37
		System.out.println(s.getName());// "Sahana"
		System.out.println(s.getPhoneNo());// 7487612345L
	}

}
