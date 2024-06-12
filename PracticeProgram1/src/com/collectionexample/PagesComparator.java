package com.collectionexample;

import java.util.Comparator;

public class PagesComparator  implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		return b1.noOfPages-b2.noOfPages;
	}

}
