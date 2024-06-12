package com.has.a.relationship;

public class Address {
	int houseNo;
	String street;
	String city;
	int pincode;

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
