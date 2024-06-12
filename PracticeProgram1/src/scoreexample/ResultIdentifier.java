package scoreexample;

public class ResultIdentifier {
	void printResult(Score s) {
		int avg = (s.subject1 + s.subject2 + s.subject3) / 3;
		System.out.println(avg);
		System.out.println((avg > 50) ? "Pass" : "Fail");

	}

	public static void main(String[] args) {
		ResultIdentifier r = new ResultIdentifier();
		Score s = new Score(60, 80, 90);
		r.printResult(s);
		System.out.println(s);
	}

}
