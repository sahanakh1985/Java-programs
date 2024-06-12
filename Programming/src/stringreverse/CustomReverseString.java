package stringreverse;

import java.util.Scanner;

public class CustomReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String x = new Scanner(System.in).next();
		int n = x.length();
		String rev = "";

		for (int i = n - 1; i >= 0; i--) {
			char temp = x.charAt(i);
			rev = rev + temp;

		}
		System.out.println("The reverse of the given string is " + rev);
	}

}
