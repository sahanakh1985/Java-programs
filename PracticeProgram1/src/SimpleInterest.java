import java.util.Scanner;

public class SimpleInterest {
	static double simpleInterest(int principal, int time, double rateOfInterest) {
		return (principal * time * rateOfInterest) / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle , time ,rate of interest");
		int p = sc.nextInt();
		int t = sc.nextInt();
		double r = sc.nextDouble();

		double interest = simpleInterest(p, t, r);
		System.out.println(interest);

	}

}
