package com.day07.artify;

public class PrintArt extends Artwork {

	private int licenseTerm;

	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}

	public boolean purchase(User user) {
		if (user.getWalletBalance() >= getPrice()) {
			System.out.println("Successful Purchase");
			user.setWalletBalance(user.getWalletBalance() - getPrice());
			return true;
		} else {
			System.out.println("Insufficient Balance");
			return false;
		}
	}

	public void license(int terms, User user) {
		licenseTerm = terms;
		System.out.println("You have license for: " + terms+ " years");
		System.out.println("Available Balance: "+ user.getWalletBalance());
	}
}
