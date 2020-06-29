package com.example.jdbcdemo.GroupProject;

public class account_balance {

	private int id;
	private double balance;
	
	public account_balance(int id,double balance) {
		this.balance=balance;
		this.id=id;
	}

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
