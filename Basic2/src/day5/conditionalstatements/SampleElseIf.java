package day5.conditionalstatements;

public class SampleElseIf {
	public static void main(String[] args) {
		int avg = 20;
		if (avg >= 75) {
			System.out.println("Distiction");
		} else if (avg < 75 && avg >= 60) {
			System.out.println("First class");
		} else if (avg < 60 && avg >= 50) {
			System.out.println("Second class");
		} else if (avg < 50 && avg >= 35) {
			System.out.println("Third class");
		} else {
			System.out.println("fail");
		}

	}

}
