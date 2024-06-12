
public class WesternUnion {
	//we are using static method
	static void convertDollarToINR(int dollar, double rate) {
		System.out.println(dollar * rate);
	}

	public static void main(String[] args) {
		WesternUnion.convertDollarToINR(10, 82.5);
	}

}
