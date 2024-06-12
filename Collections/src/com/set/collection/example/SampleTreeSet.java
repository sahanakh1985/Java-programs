package com.set.collection.example;

import java.util.Arrays;
import java.util.TreeSet;

public class SampleTreeSet {
	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<>(Arrays.asList("Sahana", "Manya", "Dhanya", "Jeeva", "sahana"));
		System.out.println(names);
	}

}
