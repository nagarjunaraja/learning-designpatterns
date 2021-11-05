package com.nagarjuna.principle.interface_segregation1;

public class ReportGenerator {
	
	private Reporting transactionObject;
	
	public void generateReport(){
		System.out.println(transactionObject.getName()+" "+transactionObject.productBreakDown()+" "+transactionObject.getDate());
	}

}
