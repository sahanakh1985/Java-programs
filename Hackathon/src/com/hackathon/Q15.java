package com.hackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// in a given string print the unique words
		Scanner scan = new Scanner(System.in);
		System.out.println("enter input string");
		String[] str = scan.nextLine().split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (String s : str) {
			if (!al.contains(s)) {
				al.add(s);
			}
		}
		Iterator<String> it = al.iterator();
		for (String s : al) {
			System.out.print(it.next() + " ");
		}
	}

}
