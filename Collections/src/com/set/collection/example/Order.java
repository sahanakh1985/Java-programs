package com.set.collection.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Order {
	int orderId;
	int quantity;
	double totalCost;

	public Order(int orderId, int quantity, double totalCost) {
		this.orderId = orderId;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", totalCost=" + totalCost + "]\n";
	}

	public static void main(String[] args) {
		Order o1 = new Order(2234, 50, 2300.0);
		Order o2 = new Order(2234, 100, 3230.0);
		Order o3 = new Order(2234, 430, 62300.0);
		Order o4 = new Order(3334, 500, 78300.0);
		Order o5 = new Order(4434, 250, 43300.0);

		HashSet<Order> ordersDetails = new HashSet(Arrays.asList(o1, o2, o3, o4, o5));
		System.out.println(ordersDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return orderId == other.orderId;
	}

}
