package com.mapexample;

import java.util.HashMap;
import java.util.Set;

public class SampleMapWithKeySet {
	public static void main(String[] args) {
		HashMap<Integer, String> studentData = new HashMap<>();
		studentData.put(1, "Alpha");
		studentData.put(2, "Beta");
		studentData.put(3, "Charlie");

		Set<Integer> keys = studentData.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		// print using Lambda
		studentData.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

	}
}
