package com.zomato.ordermodule;

public class RunnerOrder {
	public static void main(String[] args) {

		Order o = new Order(35, "Mysore", 567, "Yet to deliver");
		System.out.println(o);
		o.setStatus("Delivered");
		System.out.println(o);
	}

}
