import java.util.ArrayList;
import java.util.Arrays;

public class SampleAsListExample {
	public static void main(String[] args) {

		// using Arrays.asList() to add all the elements at a time to ArrayList
		ArrayList objectsList = new ArrayList<>(Arrays.asList(10, "Hello", 4.6, null, 'A'));
		System.out.println(objectsList);
		System.out.println(objectsList.size());

		// using forEach() retrieve the elements of ArrayList
		objectsList.forEach((e) -> System.out.println(e));

	}

}
