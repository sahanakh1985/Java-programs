package com.string.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	static void removeDuplicates(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			
		}
		int[] uniqueArr=new int[set.size()];
		int index=0;
		for (int element : set) {
			uniqueArr[index++]=element;
			
			
		}

		}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(uniqueArr));

	}

}
