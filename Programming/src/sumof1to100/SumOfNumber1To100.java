package sumof1to100;

import java.util.Iterator;

public class SumOfNumber1To100 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;

		}
		System.out.println("Sum of number 1 to 100 = " + sum);
	}

}
