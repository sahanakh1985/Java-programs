package com.interfaceexampleupi;

public class RunnerUPI {
	public static void main(String[] args) {
		UPI u = new ICICI();
		u.sendMoney();
		u.receiveMoney();
		u.checkBalance();

		UPI u2 = new HDFC();
		u2.sendMoney();
		u2.sendMoney();
		u2.checkBalance();

	}

}
