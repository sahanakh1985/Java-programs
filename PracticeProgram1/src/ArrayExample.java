import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int[] nums = { 23, 45, 67, 89, 11, 43 };
		System.out.println(nums.length);
		System.out.println(Arrays.toString(nums));

		for (int i : nums) {
			System.out.println(i);

		}
		for (int i = 0; i <= (nums.length - 1) / 2; i++) {
			System.out.print(nums[i] + " ");

		}
		System.out.println();
		for (int i = (nums.length - 1) / 2; i >= 0; i--) {
			System.out.print(nums[i] + " ");

		}

	}
}
