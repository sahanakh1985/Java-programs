import java.util.Scanner;

public class InterestCalculatorByScanner {
	static double simpleInterest(int principal, int time, double rate) {
		// simple interest formula - (principal* time*rate)/100
		double result = ((principal * time * rate) / 100);
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the principal value");
		int num1 = s.nextInt();
		System.out.println("enter the time");
		int num2 = s.nextInt();
		System.out.println("enter the rate");
		double price = s.nextDouble();

		// InterestCalculatorByScanner.simpleInterest(num1, num2, price);
		// in the below code we are calling the simple interest method
		// and store the result in value variable
		double value = simpleInterest(num1, num2, price);
		System.out.println(value);

	}

}
