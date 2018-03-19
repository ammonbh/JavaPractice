package com.practiceCar;

public class Car {
	
	public Car() {
		super();
	}
	//3
	public void run() {
		Tires tires = new Tires();
		FuelTank tank = new FuelTank();
		
		tires.function();
		tank.function();
	}
}
