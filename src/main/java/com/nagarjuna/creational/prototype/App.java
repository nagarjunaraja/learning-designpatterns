package com.nagarjuna.creational.prototype;

public class App {

	public static void main(String[] args) {

		EmployeeFactory.loadCache();

		Employee cloned1 = (Employee) EmployeeFactory.getEmployee("ETPN1");
		Employee cloned2 = (Employee) EmployeeFactory.getEmployee("ETJN1");
		Employee cloned3 = (Employee) EmployeeFactory.getEmployee("ETMN1");
		
		Employee cloned4 = (Employee) EmployeeFactory.getEmployee("ETPN1");

		System.out.println("Employee: " + cloned1.getPosition() + " ID:" + cloned1.getId());
		System.out.println("Employee: " + cloned2.getPosition() + " ID:" + cloned2.getId());
		System.out.println("Employee: " + cloned3.getPosition() + " ID:" + cloned3.getId());
		
		System.out.println(cloned1.hashCode());
		System.out.println(cloned4.hashCode());

	}

}
