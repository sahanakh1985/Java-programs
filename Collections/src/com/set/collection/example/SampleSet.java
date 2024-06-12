package com.set.collection.example;
import java.util.Arrays;
import java.util.HashSet;

public class SampleSet {
	public static void main(String[] args) {
		HashSet<String> colorSet = new HashSet<>(Arrays.asList("Green", "Red", "Yellow", null, null, "Blue"));
		System.out.println(colorSet);
	}

}
