package com.stringexample;

public class NumOfIntegersCharSpecialNumINstring {
	public static void main(String[] args) {
		String input = " Sahana123@gmail.com";
		String[] character = input.split("");
		for (String ch : character) {
			System.out.println(ch);
			String uppercase = "";
			String lowercase = "";
			String num = "";

			if (ch.equals(ch.toUpperCase())) {
				uppercase = uppercase + ch;

			} else if (ch.equals(ch.toLowerCase())) {
				lowercase = lowercase + ch;
			} else if (ch.equals(ch.equals(num))) {
				num = num + ch;

			}
			System.out.println(uppercase.length());
		}
	}
}
