package com.nagarjuna.principle.single_responsibility.reporting;

import com.nagarjuna.principle.single_responsibility.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	public String getFormattedEmployee(){
		return getFormattedValue();
	}
	
}
