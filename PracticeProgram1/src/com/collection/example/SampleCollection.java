package com.collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SampleCollection {
	public static void main(String[] args) {

		ArrayList<String> colorList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Red", "Yellow"));
		colorList.size();
		System.out.println(colorList.size());
		System.out.println(colorList.get(3));
		System.out.println(colorList.contains("Red"));
		System.out.println(colorList.indexOf("Green"));
		System.out.println(colorList.isEmpty());
		System.out.println(colorList.set(3, "orange"));
		System.out.println(colorList.get(3));
	}

}
