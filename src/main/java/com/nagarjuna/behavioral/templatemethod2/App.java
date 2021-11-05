package com.nagarjuna.behavioral.templatemethod2;

public class App {

	public static void main(String[] args) {
		
		Employee employee = new Programmer();
		employee.comeToWork();
		
		employee = new Manager();
		employee.comeToWork();
	}
}
