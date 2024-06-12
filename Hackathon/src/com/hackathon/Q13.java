package com.hackathon;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// reverse string , input=java code ,output=edoc avaj
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.nextLine();

		int num = input.length();
		String rev = "";
		for (int i = num-1; i >=0; i--) {
			char temp = input.charAt(i);
			rev = rev + temp;

		}
		System.out.println("The reverse of given input is :" + rev);

	}

}
