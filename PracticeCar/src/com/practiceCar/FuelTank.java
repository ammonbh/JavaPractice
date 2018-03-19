package com.practiceCar;

public class FuelTank extends CarPart{

	private double gallons = 0.0d;
	
	
	public FuelTank() {
		super();
		if(gallons < 1.0d) {
			System.out.println("Why don't you fill me up, buttercup?");
		}
		if(gallons > 15d) {
			System.out.println("Tank is full.");
		}
		if(gallons < 0d || gallons > 15d) {
			System.out.println("Gallons does not make sense, please re-initialize and fill correctly.");
		}
	}
	
	public String fillUp (double gals) {
		if(gals < 0d || gals > 15d) {
			System.out.println("Gallons does not make sense, please re-initialize and fill correctly.");
		}
		else {setGallons(gals);}
		String report = "You have " + getGallons() + " in the tank.";
		return report;
	}
	
	public double getGallons() {
		return gallons;
	}

	public void setGallons(double gallons) {
		this.gallons += gallons;
	}
	
	@Override
	public String function() {
		String funct = "This car part is in " + status() + " condition, and has " + getGallons() + " gallons left.";
		return funct;
	}
}
