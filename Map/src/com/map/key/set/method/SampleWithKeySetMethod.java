package com.map.key.set.method;

import java.awt.LinearGradientPaint;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class SampleWithKeySetMethod {
	public static void main(String[] args) {

		HashMap<Integer, String> studentData = new HashMap<>();
		studentData.put(1, "Alpha");
		studentData.put(2, "Beta");
		studentData.put(3, "Charlie");

		Set<Integer> keys = studentData.keySet();
		for (Integer key : keys) {
			System.out.println(key);

		}
		// conversion from Set to LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(keys);
	}

}
