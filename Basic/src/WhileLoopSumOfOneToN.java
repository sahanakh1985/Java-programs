
public class WhileLoopSumOfOneToN {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;// sum+=i;
			System.out.println(sum);
			i++;

		}
		System.out.println(i);

	}

}
