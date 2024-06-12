package com.methodsofcollectionexample;

import java.util.ArrayList;

public class SampleMethodsOfCollection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(34);
		list.add("hello");
		list.add(4.5);
		list.add(null);
		list.add(78);
		list.add(true);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(4.5));
		System.out.println(list.isEmpty());
		list.remove(null);
		System.out.println(list);
		list.clear();
		System.out.println(list);

	}

}
