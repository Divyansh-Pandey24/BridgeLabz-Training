package com.day08.homenest;

public class Camera extends Device {


	public Camera(int deviceId, boolean status, double energyUsage, User u) {
		super(deviceId, status, energyUsage);
		u.addDevice(deviceId);
		
	}

	@Override
	public void turnOn() {
	  
		setStatus(true);
	}

	@Override
	public void turnOff() {
		
		setStatus(false);
	}

	@Override
	public void reset() {
		setStatus(false);
		
	}
	
	@Override
	public double calculateEnergy(double time) {
		return time * getenergyUsage();
	}
	
	public void changeStatus(boolean newStatus) {
		setStatus(newStatus);
		
	}
	
}
