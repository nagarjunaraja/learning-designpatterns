package com.nagarjuna.behavioral.templatemethod1;


public class CheapLoanCalculation extends LoanCalculationAlgorithm {


    @Override
    int getBaseAmount() {
        return 100000;
    }

    @Override
    double getInterest() {
        return 3;
    }

    @Override
    int caclulateDiscount() {
        return 5000;
    }
}
