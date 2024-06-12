package com.sortingofmobileobject;

import java.util.Comparator;

public class BrandComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return (int) (o1.brand.compareTo(o2.brand));
	}

}
