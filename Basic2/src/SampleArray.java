
public class SampleArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		// iterate the complete array in forward direction
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		// iterate the complete array in reverse direction
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		// forward-first half
		for (int i = 0; i < (arr.length) / 2; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		// backward first half
		for (int i = (arr.length - 1) / 2; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		// forward-second half
		for (int i = (arr.length) / 2; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		// backward second half
		for (int i = arr.length - 1; i >= (arr.length) / 2; i--) {
			System.out.print(arr[i] + " ");

		}

	}

}
