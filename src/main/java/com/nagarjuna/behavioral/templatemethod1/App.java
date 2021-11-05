package com.nagarjuna.behavioral.templatemethod1;


public class App {

    public static void main(String[] args) {
        LoanCalculationAlgorithm loanCalculationAlgorithm = new ExpensiveLoanCalculation();
        System.out.println(loanCalculationAlgorithm.calculateLoan());


        loanCalculationAlgorithm = new CheapLoanCalculation();
        System.out.println(loanCalculationAlgorithm.calculateLoan());
    }

}
