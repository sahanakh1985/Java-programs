import java.util.ArrayList;
import java.util.Collections;

public class SampleCollection {
	public static void main(String[] args) {
		ArrayList<String> colorsList = new ArrayList<>();

		colorsList.add("Red");
		colorsList.add("Green");
		colorsList.add("Blue");
		colorsList.add("Yellow");
		colorsList.add("White");
		System.out.println(colorsList);

		// printing elements in collection using for each loop
		for (String color : colorsList) {
			System.out.println(color);

		}
		// sorting in ascending order
		Collections.sort(colorsList);
		System.out.println(colorsList);

		// sorting in descending order
		Collections.sort(colorsList, Collections.reverseOrder());
		System.out.println(colorsList);

	}

}
