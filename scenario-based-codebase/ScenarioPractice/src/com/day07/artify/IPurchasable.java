package com.day07.artify;

public interface IPurchasable {

	boolean purchase(User user);
	void license(int terms, User user);
}
