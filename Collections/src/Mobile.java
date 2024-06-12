import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mobile implements Comparable<Mobile> {
	String color;
	String brand;
	double price;

	public Mobile(String color, String brand, double price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [color=" + color + ", brand=" + brand + ", price=" + price + "]\n";
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Black", "Apple", 70000);
		Mobile m2 = new Mobile("White", "Samsung", 30000);
		Mobile m3 = new Mobile("Blue", "MI", 25000);
		Mobile m4 = new Mobile("Green", "0nePlus", 35000);

		ArrayList<Mobile> mobileList = new ArrayList<>();

		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);

		System.out.println(mobileList);

		// retrieve the elements by using for-each loop
		for (Mobile mob : mobileList) {
			System.out.println(mob);
			System.out.println(mob.color);

			// sorting the "double" parameter of mobiles in ascending order

			Collections.sort(mobileList);
			System.out.println(mobileList);

			// sort the "color" parameter of Mobile object using Lambda in descending order
			Comparator<Mobile> mbComparator = (mb1, mb2) -> mb1.color.compareTo(mb2.color);
			Collections.sort(mobileList, mbComparator.reversed());
			System.out.println(mobileList);

		}

	}

	@Override
	public int compareTo(Mobile o) {
		return (int) (this.price - o.price);

	}

}
