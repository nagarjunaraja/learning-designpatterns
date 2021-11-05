package com.nagarjuna.creational.prototype;

public class Manager extends Employee {
	
	public Manager() {
		position = "Intern";
	}

	@Override
	void work() {
		System.out.println("Delegating the tasks..");
	}

}
