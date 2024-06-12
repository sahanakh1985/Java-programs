package com.kh.encapsulation.student;

public class RunnerOrder {
	public static void main(String[] args) {
		Order o = new Order();
		o.setOrderID(12);
		o.setShippingAddress("mysore");

		o.setTotalAmount(500);

		System.out.println(o.getOrderID());
		System.out.println(o.getShippingAddress());
		System.out.println(o.getTotalAmount());

	}

}
