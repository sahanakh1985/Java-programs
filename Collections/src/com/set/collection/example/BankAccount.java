package com.set.collection.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class BankAccount {
	long accountNo;
	String name;
	double balance;

	public BankAccount(long accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]\n";
	}
	// we have to override hashcode and equal method because we use BankAccount
	// object

	@Override
	public int hashCode() {
		return Objects.hash(accountNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return accountNo == other.accountNo;
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(12345, "Alpha", 2567.0);
		BankAccount b2 = new BankAccount(12345, "Beta", 44567.0);
		BankAccount b3 = new BankAccount(12345, "Charlie", 567567.0);
		BankAccount b4 = new BankAccount(23456, "Delta", 345567.0);

		HashSet<BankAccount> allAccounts = new HashSet<>(Arrays.asList(b1, b2, b3, b4));

		System.out.println(allAccounts);
	}

}
