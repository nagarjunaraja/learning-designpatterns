package com.nagarjuna.structural.facade2;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
         
        reportGeneratorFacade.generateReport(ReportType.HTML, null, null);
         
        reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
    }
}
