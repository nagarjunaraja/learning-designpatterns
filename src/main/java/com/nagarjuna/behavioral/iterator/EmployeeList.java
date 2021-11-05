package com.nagarjuna.behavioral.iterator;



public class EmployeeList implements List<Employee>{
	
	private Employee [] employees;
	
	public EmployeeList(Employee[] employees) {
		this.employees = employees;
	}

	@Override
	public Iterator<Employee> iterator() {
		return new EmployeeIterator(employees);
	}

}
