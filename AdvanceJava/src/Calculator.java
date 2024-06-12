
public class Calculator {

	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		// creating object of the class to access the method
		Calculator c = new Calculator();
		// calling the method add using object reference (c)and .(dot)operator
		//and storing back the returned value in the sum variable
		//the variable 
		int sum = c.add(3, 5);
		System.out.println(sum);// 8

		sum = c.add(1234, 5678);
		System.out.println(sum);
	}

}
