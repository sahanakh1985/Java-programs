
public class TernaryOperatorExample3 {
	public static void main(String[] args) {
		int age = 10;
		System.out.println((age >= 0 && age <= 12) ? "child" : (age >= 13 && age <= 100) ? "adult" : "wrong value");
	}
}// for 2 or more conditions, its better to use'if else' statement
//if there is only one condition , then you can use ternary operator