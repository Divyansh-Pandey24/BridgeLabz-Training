package com.day07.artify;

abstract public class Artwork implements IPurchasable {

	protected String title;
	protected String artist;
	private double price;
	private String licenseType;
	
	public Artwork(String title, String artist,double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
	}
	
	public double getPrice() {
		return price;
	}
	public String getLicenseType() {
		return licenseType;
	}
	
}
