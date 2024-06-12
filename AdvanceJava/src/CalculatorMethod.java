
public class CalculatorMethod {
	static int add(int a, int b) {
		return (a + b);
	}

	static int add(int a, int b, int c) {
		return (a + b);
	}

	static int add(int a, int b, int c, int d) {
		return (a + b);
	}

	static double add(double x, double y) {
		return (x + y);
	}

	public static void main(String[] args) {
		double result = CalculatorMethod.add(3.2, 6.3);
		System.out.println(result);

		int sum = CalculatorMethod.add(10, 20, 30);
		System.out.println(sum);

	}

}
