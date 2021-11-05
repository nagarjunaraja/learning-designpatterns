package com.nagarjuna.behavioral.observer;

public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String message) {
		System.out.println("HR Department Notified..");
		System.out.println(message + ": " + employee.getName());
	}

	
}
