package reversepalindrome;

import java.util.Scanner;

public class BuiltInReverse {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();
		String num = n + "";
		StringBuilder sb = new StringBuilder(num);
		sb=sb.reverse();//its a pre-defined method to reverse string
		String reverse = sb.toString();

		System.out.println(num.equals(reverse) ? "Palindrome" : "Not Palindrome");
	}

}
