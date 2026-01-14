package com.day08.homenest;

import java.util.ArrayList;
import java.util.List;

public class User {

	List<Integer> devices;
	String name;
	
	public User(String name) {
		this.devices = new ArrayList<>();
		this.name = name;
	}
	
	public void addDevice (int deviceId) {
		devices.add(deviceId);
	}
	
}
