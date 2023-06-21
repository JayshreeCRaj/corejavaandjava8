package com.java8.streams;

public class HDFCBank {
	
	String customerName;
	int accountNumber;
	int balance;
	
	public HDFCBank(String customerName, int accountNumber, int balance) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "HDFCBank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
	

}
