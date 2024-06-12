
public class InterestCalculator {
	static double simpleInterest(int principal, int time, double rateOfInterest) {
		// simple interest formula - (principal*time*rate)/100
		double result = ((principal * time * rateOfInterest) / 100);
		return result;
	}

	public static void main(String[] args) {
		// declare a variable called value,to store the result of simple interest
		/*
		 * declare a variable value of data type 'double',because our return type is
		 * double
		 */
		double interest = InterestCalculator.simpleInterest(100000, 1, 5.5);
		System.out.println(interest);
	}

}
