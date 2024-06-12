package com.set.collection.example;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SampleLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> color = new LinkedHashSet<>
		(Arrays.asList("Green", null, "Red", "Blue", null, "Red"));
		System.out.println(color);

	}

}
