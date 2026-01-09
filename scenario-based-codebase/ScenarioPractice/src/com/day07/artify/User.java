package com.day07.artify;

public class User {

	protected String name;
	private double walletBalance;
	
	public User(String name, Double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	
	public void setWalletBalance(double remainingBalance) {
		walletBalance = remainingBalance;
	}
}
