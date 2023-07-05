package com.engine.main;

public class VehicleClass {
	String fuelType;
	int engineStatus,speed;
	public VehicleClass() {
		
	}
public VehicleClass(String fuelType,int speed,int engineStatus) {
		this.fuelType=fuelType;
		this.speed=speed;
		this.engineStatus=engineStatus;
	}
public void startEngine(int engineStatus) {
	this.engineStatus=engineStatus;
}

}
