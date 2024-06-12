import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1 and n2 values");
		double num1 = sc.nextInt();
		double num2 = sc.nextDouble();

		System.out.println("enter the operator -> +/-/* or /");
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+': {

			System.out.println("sum of two numbers :" + (num1 + num2));
			break;
		}
		case '-': {

			System.out.println("sub of two numbers :" + (num1 - num2));
			break;
		}
		case '*': {

			System.out.println("multipication of two numbers :" + (num1 * num2));
			break;
		}
		case '/': {

			System.out.println("division of two numbers :" + (num1 / num2));
			break;
		}
		default:
			System.out.println("enter a valid operator");
		}
		return;
	}
}
