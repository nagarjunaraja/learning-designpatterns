package com.nagarjuna.behavioral.iterator;

public class EmployeeIterator implements Iterator<Employee> {

	private Employee[] employees;
	private int position;
	
	public EmployeeIterator(Employee[] employees) {
		this.employees = employees;
	}
	
	@Override
	public void reset() {
		position = 0;
	}

	@Override
	public Employee next() {
		return employees[position++];
	}

	@Override
	public Employee currentItem() {
		return employees[position];
	}

	@Override
	public boolean hasNext() {
		if(position >= employees.length)
			return false;
		return true;
	} 
	
	

}
