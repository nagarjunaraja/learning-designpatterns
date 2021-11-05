package com.nagarjuna.behavioral.observer;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDepartment();
		IObserver hr = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.registerObserver(payroll);
		ems.registerObserver(hr);
		
		System.out.println("Before Employees Count  - " + ems.count());
		
		Employee newEmployee = new Employee("Raja", new Date(), 35000, true);
		
		ems.hireNewEmployee(newEmployee);
		
		System.out.println("After Employees Count  - " + ems.count());
		
		ems.modifyEmployeeName(6, "Nagarjuna");
		
	}
}
