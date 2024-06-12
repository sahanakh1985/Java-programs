import java.util.Arrays;

public class MergingOfArrays {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 50, 60, 70, 80 };
		int[] res = new int[arr1.length + arr2.length];

		System.out.println(res.length);

		for (int i = 0, j = 0; i < res.length; i++) {
			if (i < arr1.length) {
				res[i] = arr1[i];

			} else {
				res[i] = arr2[j];
				j++;

			}

		}
		System.out.println(Arrays.toString(res));

	}

}
