package com.day08.homenest;

abstract public class Device implements IControllable {

	private int deviceId;
	private boolean status;
	protected double energyUsage;
	
	public Device(int deviceId, boolean status, double energyUsage) {
		this.deviceId = deviceId;
		this.status = status;
		this.energyUsage = energyUsage;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean newStatus) {
		status = newStatus;
	}
	
	public double getenergyUsage() {
		return energyUsage;
	}
	
	abstract double calculateEnergy(double time);
		
	
}
