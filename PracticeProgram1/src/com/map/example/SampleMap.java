package com.map.example;

import java.util.HashMap;

public class SampleMap {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "sahana");
		map.put(2, "manya");
		map.put(3, "dhanya");
		map.put(4, "kavya");
		map.put(5, "keerthi");
		map.put(2, "amar");

		// using for-each method to retrieve the key and values
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
			System.out.println(k + " " + v);
		});

		System.out.println(map.size());

		System.out.println(map.get(3));

		System.out.println(map.containsKey(6));

	}

}
