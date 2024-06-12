package averageofstudent;

import java.util.Scanner;

public class AverageOfStudent {
	public static void main(String[] args) {
		System.out.println("Enter the average number");
		int avg = new Scanner(System.in).nextInt();

		if (avg > 75) {
			System.out.println("Distinction");
		} else if (avg < 75 && avg >= 60) {
			System.out.println("First class");
		} else if (avg < 60 && avg >= 50) {
			System.out.println("Second  class");
		} else if (avg < 45 && avg >= 35) {
			System.out.println("Just pass");
		} else {
			System.out.println("Fail");
		}

	}

}
