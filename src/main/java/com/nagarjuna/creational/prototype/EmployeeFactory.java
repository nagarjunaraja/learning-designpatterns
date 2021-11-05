package com.nagarjuna.creational.prototype;

import java.util.Hashtable;

public class EmployeeFactory {

	private static Hashtable<String, Employee> employeeMap = new Hashtable<String, Employee>();
	
	public static Employee getEmployee(String employeeId) {
		Employee cacheEmployee = employeeMap.get(employeeId);
		return (Employee)cacheEmployee.clone();
	}
	
	public static void loadCache() {
        // predefined objects to simulate retrieved objects from the database
        Programmer programmer = new Programmer();
        programmer.setId("ETPN1");
        employeeMap.put(programmer.getId(), programmer);
        
        Analyst analyst = new Analyst();
        analyst.setId("ETJN1");
        employeeMap.put(analyst.getId(), analyst);
        
        Manager manager = new Manager();
        manager.setId("ETMN1");
        employeeMap.put(manager.getId(), manager);
    }
}
