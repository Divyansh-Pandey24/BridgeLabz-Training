package com.day08.homenest;

public class Light extends Device {


	public Light(int deviceId, boolean status, double energyUsage, User u) {
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
