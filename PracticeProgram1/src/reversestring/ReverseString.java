package reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter the input");

		String input = new Scanner(System.in).next();

		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String reverse = sb.toString();

		System.out.println(reverse);

	}

}
