package com.nagarjuna.behavioral.templatemethod1;


public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm {


    @Override
    int getBaseAmount() {
        return 100000;
    }

    @Override
    double getInterest() {
        return 5.4;
    }

    @Override
    int caclulateDiscount() {
        return 100;
    }
}
