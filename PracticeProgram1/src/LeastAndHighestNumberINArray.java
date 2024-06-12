
public class LeastAndHighestNumberINArray {
	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int[] nums = { 34, 5, 76, 11, 83, 2, 99 };
		for (int i = 0; i < nums.length; i++) {

			if (min > nums[i]) {
				min = nums[i];
			}
			if (max < nums[i]) {
				max = nums[i];
			}

		}
		System.out.println("Least  number is " + min);
		System.out.println("Highest number is " + max);

	}
}
