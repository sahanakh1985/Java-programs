package stringreverse;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String input = new Scanner(System.in).next();
		// create a stringBuilder object
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();// call the reverse() of stringBuilder class
		// convert the stringbuilder object to string format ,then stored in reverse
		// variable
		String reverse = sb.toString();
		System.out.println(reverse);

	}

}
