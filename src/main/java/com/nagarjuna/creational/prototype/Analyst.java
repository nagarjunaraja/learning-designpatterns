package com.nagarjuna.creational.prototype;

public class Analyst extends Employee {
	
	public Analyst() {
		position = "Analyst";
	}

	@Override
	void work() {
		System.out.println("Providing requirement..");
	}

}
