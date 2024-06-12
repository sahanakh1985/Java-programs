package com.map.key.set.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class SampleWithValueMethod {
	public static void main(String[] args) {

		HashMap<Integer, String> studentData = new HashMap<>();
		studentData.put(1, "Alpha");
		studentData.put(2, "Beta");
		studentData.put(3, "Charlie");

		Collection<String> values = studentData.values();
		for (String value : values) {
			System.out.println(value);

		}
		// this is sample conversion from collection to ArrayList
		ArrayList<String> al = new ArrayList<>(values);

	}
}
