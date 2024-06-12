package com.has.a.relationship;

public class Student {
	int sno;
	String name;
	Address address = new Address();

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		s.sno = 5;
		s.name = "Alpha";
		s.address.houseNo = 43;
		s.address.city = "Bangalore";
		s.address.street = "4th cross";
		s.address.pincode = 560004;
		System.out.println(s);

	}
}
