package day9.array;

public class OneDimensionalArray {
	public static void main(String[] args) {

		// direct or dynamic array initialization
		int[] nums = { 10, 20, 30, 40 };
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);

		// indirect array initialization
		String[] names = new String[3];
		names[0] = "sahana";
		names[1] = "priya";

		names[2] = "Ammu";

		System.out.println(names[1]);

		System.out.println("_____________________________________---");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
	}

}
