package com.sortingofflightobjectsexample;

import java.util.Comparator;

public class CostPerTicketComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {

		return (int) (o1.costPerTicket - o2.costPerTicket);
	}
	
	

}
