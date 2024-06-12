package com.interfaceexampleupi;

public class HDFC implements UPI {

	@Override
	public void sendMoney() {
		System.out.println("Sending money through HDFC");

	}

	@Override
	public void receiveMoney() {
		System.out.println("Receving money from HDFC");

	}

	@Override
	public void checkBalance() {
		System.out.println("Check the money in HDFC");

	}

}
