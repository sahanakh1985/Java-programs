import java.util.Scanner;

public class SquareFinderByScanner {

	static void square(int number) {
		System.out.println(number * number);

	}

	public static void main(String[] args) {
		// call the static square method and pass value as n
		// hint:use class name and .(dot) operator for calling static methods
		// SquareFinderByScanner.square(5);//calling a method without scanner

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		SquareFinderByScanner.square(n);

	}

}
