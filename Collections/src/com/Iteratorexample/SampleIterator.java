package com.Iteratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SampleIterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer x = itr.next();
			System.out.println(x);
			itr.remove();

		}
		System.out.println(al);

	}

}
