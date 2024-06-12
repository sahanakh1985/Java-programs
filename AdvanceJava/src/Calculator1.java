
public class Calculator1 {
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	int subtract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	int division(int num1, int num2) {
		int result = num1 / num2;
		return result;

	}

	public static void main(String[] args) {

		Calculator1 c = new Calculator1();
		int sum = c.add(3, 4);
		int sub = c.subtract(10, 6);
		int mul = c.multiply(2, 10);
		int div = c.division(15, 3);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);

	}

}
