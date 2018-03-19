package com.practiceCar;

public class CarPart implements Functional {
	int condition = 100;
	public int status() {
		
		this.condition = condition -1;
		return condition;
		
	}
	@Override
	public String function() {
		String funct = "This car part is in " + status() + " condition.";
		return funct;
	}
}
