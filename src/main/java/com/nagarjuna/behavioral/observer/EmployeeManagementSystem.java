package com.nagarjuna.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {
	
	private Employee employee;
	private String message;
	private List<IObserver> observers;
	private List<Employee> employees;
	private EmployeeDAO employeeDao;
	
	
	public EmployeeManagementSystem() {
	 observers = new ArrayList<IObserver>();
	 employeeDao = new EmployeeDAO();
	 employees = employeeDao.generateEmployees();
	}
	
	public int count() {
		return employees.size();
	}
	
	public void hireNewEmployee(Employee employee) {
		this.employee = employee;
		this.message = "New Hire";
		employees.add(employee);
		notifyObservers();
	}
	
	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee employee : employees) {
			if (id == employee.employeeID) {
				employee.setName(newName);
				this.employee = employee;
				this.message = "Employee Name Changed";
				notify = true;
			}
		}
		if(notify)
			notifyObservers();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void notifyObservers() {
		for(IObserver department : observers) {
			department.callMe(employee,message);
		}
	}

}
