package com.nagarjuna.principle.single_responsibility.clients;
import com.nagarjuna.principle.single_responsibility.domain.Employee;
import com.nagarjuna.principle.single_responsibility.domain.dao.EmployeeDAO;
import com.nagarjuna.principle.single_responsibility.reporting.EmployeeReportFormatter;
import com.nagarjuna.principle.single_responsibility.reporting.FormatType;


public class ClientModule {
	
	public static void main(String args[]) {
		
		Employee peggy = new Employee(1, "peggy","accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.CSV);
		
	}
	
	public static void hireNewEmployee(Employee employee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);		
	}
	
	public static void terminateEmployee(Employee employee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.removeEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType formatType){
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
		
	}

}
