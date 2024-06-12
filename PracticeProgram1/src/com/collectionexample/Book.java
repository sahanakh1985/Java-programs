package com.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book implements Comparable<Book> {
	String brand;
	int noOfPages;
	double price;

	public Book(String brand, int noOfPages, double price) {
		this.brand = brand;
		this.noOfPages = noOfPages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [brand=" + brand + ", noOfPages=" + noOfPages + ", price=" + price + "]\n";
	}

	public static void main(String[] args) {
		Book b1 = new Book("Alpha", 50, 400);
		Book b2 = new Book("Beta", 100, 200);
		Book b3 = new Book("gamma", 150, 300);

		ArrayList<Book> booksList = new ArrayList<>();
		booksList.add(b1);
		booksList.add(b2);
		booksList.add(b3);

		System.out.println(booksList);

		Collections.sort(booksList);
		System.out.println(booksList);

		Collections.sort(booksList, Collections.reverseOrder());
		System.out.println(booksList);

		System.out.println("sorting the book object based on price");
		PriceComparator pc = new PriceComparator();
		Collections.sort(booksList, pc);
		System.out.println(booksList);

		System.out.println("_____________----------------------------");
		System.out.println("sorting based on pages in descending order");
		PagesComparator pg = new PagesComparator();
		Collections.sort(booksList, pg.reversed());
		System.out.println(booksList);

		System.out.println("sorting based on brand in descending order using lambda");
		Comparator<Book> brandComparator = (x, y) -> x.brand.compareTo(y.brand);
		Collections.sort(booksList, brandComparator.reversed());
		System.out.println(booksList);

		System.out.println("sorting based on pages in descending order using lambda expression");
		Comparator<Book> pageComparator = (a, b) -> a.noOfPages - b.noOfPages;
		Collections.sort(booksList, pageComparator.reversed());
		System.out.println(booksList);

	}

	@Override
	public int compareTo(Book o) {

		return this.brand.compareTo(o.brand);
	}

}
