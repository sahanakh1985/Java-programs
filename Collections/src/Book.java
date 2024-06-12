import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book implements Comparable<Book> {
	double price;
	String brand;
	int noOfPages;
	long slNo;

	public Book(double price, String brand, int noOfPages, long slNo) {
		this.price = price;
		this.brand = brand;
		this.noOfPages = noOfPages;
		this.slNo = slNo;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", brand=" + brand + ", noOfPages=" + noOfPages + ", slNo=" + slNo + "]\n";
	}

	public static void main(String[] args) {
		Book b1 = new Book(300, "Alpha", 100, 123456789L);
		Book b2 = new Book(400, "Beta", 130, 453267859L);
		Book b3 = new Book(699, "King", 120, 234516578L);
		Book b4 = new Book(800, "Blue", 150, 764516578L);

		ArrayList<Book> booksList = new ArrayList<>();
		booksList.add(b1);
		booksList.add(b2);
		booksList.add(b3);
		booksList.add(b4);

		System.out.println(booksList);

		// sort the books in brand name ascending order
		Collections.sort(booksList);
		System.out.println(booksList);

		// sorting the price parameter of BOOK by Comparator in descending order
		PriceComparator pc = new PriceComparator();
		Collections.sort(booksList, pc.reversed());
		System.out.println(booksList);

		// use Lambda to sort noOfPages in Book object in ascending order
		Comparator<Book> pages = (p1, p2) -> (p1.noOfPages - p2.noOfPages);
		System.out.println(pages);

	}

	@Override
	public int compareTo(Book o) {
		return this.brand.compareTo(o.brand);
	}

}
