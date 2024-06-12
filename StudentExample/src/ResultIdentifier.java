
public class ResultIdentifier {

	void printResult(Score s) {
		int avg = (s.subject1 + s.subject2 + s.subject3) / 3;

		System.out.println("Average marks of  3 subjects = " + avg);
		if (avg > 50) {
			System.out.println("pass");

		} else {

			System.out.println("fail");
		}

	}

	public static void main(String[] args) {
		ResultIdentifier r = new ResultIdentifier();
		Score sc = new Score(80, 20, 33);
		r.printResult(sc);

	}

}
