package com.zomato.ordermodule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private int orderId;
	private String shippingAddress;
	private double totalAmount;
	private String status;

}
