package com.interfaceexampleupi;

public class ICICI implements UPI {

	@Override
	public void sendMoney() {
		System.out.println("Sending money through ICICI");
	}

	@Override
	public void receiveMoney() {
		System.out.println("Receiving money from ICICI");

	}

	@Override
	public void checkBalance() {
		System.out.println("Check the balance in ICICI");

	}

}
