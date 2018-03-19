package com.practiceCar;

public class Tires extends CarPart implements Functional{

	private int tread = 40_000;
	
	public Tires() {
		this.setTread(this.getTread() - 20);
	}

	public int getTread() {
		return tread;
	}

	public void setTread(int tread) {
		this.tread = tread;
	}
	
	@Override
	public String function() {
		String funct = "The tires are " + status() + " condition, and have " + tread + " miles left.";
		return funct;
	}
	
}
