package simpledigitcheck;

import java.util.Scanner;

public class FindAreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter the radius");
		double radius = new Scanner(System.in).nextDouble();

		double areaOfCircle = 3.142 * radius * radius;
		System.out.println("The area of circle is =" + areaOfCircle);
	}

}
