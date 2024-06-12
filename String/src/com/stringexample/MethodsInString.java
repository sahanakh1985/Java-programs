package com.stringexample;

public class MethodsInString {
	public static void main(String[] args) {
		String name1 = "hello";
		String name2 = "world";

		System.out.println(name1.length());

		System.out.println(name2.charAt(1));

		System.out.println(name1.compareTo(name2));

		System.out.println(name1.concat(name2));

		System.out.println(name1.indexOf('o'));

		System.out.println(name2.isEmpty());

		System.out.println(name1.toUpperCase());

		System.out.println("AMMU".toLowerCase());

		System.out.println("Dhanya".replace('h', '*'));

		System.out.println("JAVA PROGRAM".replace("JAVA", "##"));

		System.out.println("I love my India".substring('l'));

		System.out.println("I love my India".substring('v', 'i'));

		System.out.println("amma".getBytes());

	}

}
