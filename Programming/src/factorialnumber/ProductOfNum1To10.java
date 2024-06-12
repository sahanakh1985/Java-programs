package factorialnumber;

public class ProductOfNum1To10 {
	public static void main(String[] args) {
		int i;
		int result = 1;
		for (i = 10; i >= 1; i--) {
			result = result * i; // result*=i;

		}
		System.out.println("Product of 1 to 10 =" + result);

	}

}
