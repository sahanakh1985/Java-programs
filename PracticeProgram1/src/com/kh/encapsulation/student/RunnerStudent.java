package com.kh.encapsulation.student;

public class RunnerStudent {

	public static void main(String[] args) {
		Student s = new Student();

		s.setAge(37);
		s.setName("sahana");
		s.setPhoneNm(7483480345L);

		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s.getPhoneNm());

	}

}
