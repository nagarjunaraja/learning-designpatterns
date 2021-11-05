package com.nagarjuna.behavioral.iterator;

public class App {
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[4];
		
		employees[0] = new Employee("Nagarjuna");
		employees[1] = new Employee("Achuyutha");
		employees[2] = new Employee("Anjana");
		employees[3] = new Employee("Arjun");
		
	    List<Employee> list = new EmployeeList(employees);
	    
	    Iterator<Employee> iterator = list.iterator();
	    
	    while(iterator.hasNext()) {
	    	Employee employee = iterator.next();
	    	System.out.println(employee.getName());
	    }
		
		 
		
	}

}
