package com.kh.encapsulation.student;

public class Order {
	private int orderID;
	private String shippingAddress;
	private double totalAmount;
	private boolean isDelivered;
	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return shippingAddress;
	}
	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the isDelivered
	 */
	public boolean isDelivered() {
		return isDelivered;
	}
	/**
	 * @param isDelivered the isDelivered to set
	 */
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	
	

}
