package com.set.collection.example;

import java.util.Arrays;
import java.util.HashSet;

public class SampleStringHashSet {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>(Arrays.asList("sahana", "manya", "sahana", "manya", null));
		// no need to override hashcode and equals method , they are already overriden
		System.out.println(names);

	}

}
