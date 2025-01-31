package com.sortingofflightobjectsexample;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Flight implements Comparable<Flight> {
	int flightNo;
	String flightName;
	int noOfSeats;
	double costPerTicket;

	public Flight(int flightNo, String flightName, int noOfSeats, double costPerTicket) {
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.noOfSeats = noOfSeats;
		this.costPerTicket = costPerTicket;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", flightName=" + flightName + ", noOfSeats=" + noOfSeats
				+ ", costPerTicket=" + costPerTicket + "]\n";
	}

	public static void main(String[] args) {
		Flight f1 = new Flight(122, "Air India", 200, 5380);
		Flight f2 = new Flight(123, "IndiGo", 210, 4300);
		Flight f3 = new Flight(124, "Alliance Air", 220, 6000);
		Flight f4 = new Flight(125, "True Jet", 230, 6500);

		ArrayList<Flight> flightsList = new ArrayList<>();
		flightsList.add(f1);
		flightsList.add(f2);
		flightsList.add(f3);
		flightsList.add(f4);
		System.out.println(flightsList);

		// using for-each loop retrieve the flight objects
		for (Flight ft : flightsList)
			System.out.println(ft);

		// sorting of flight by default sorting(using comparable)
		// based on flightNo in ascending order
		System.out.println("Sorting by default, based on flilghtNo in ascending order ");
		Collections.sort(flightsList);
		System.out.println(flightsList);

		System.out.println("sorting based on flightName using Lambda in ascending order");
		Comparator<Flight> nameComparator = (a1, a2) -> a1.flightName.compareTo(a2.flightName);
		Collections.sort(flightsList, nameComparator);
		System.out.println(flightsList);

		System.out.println("sorting based on noOfSeats using Lambda in descending order");
		Comparator<Flight> seatComparator = (s1, s2) -> s1.noOfSeats - (s2.noOfSeats);
		Collections.sort(flightsList, seatComparator.reversed());
		System.out.println(flightsList);

		System.out.println(" sorting by Comparator,based on costPerTicket in ascending order");
		CostPerTicketComparator cost = new CostPerTicketComparator();
		Collections.sort(flightsList, cost);
		System.out.println(flightsList);

	}

	@Override
	public int compareTo(Flight o) {
		return this.flightNo - o.flightNo;
	}

}
