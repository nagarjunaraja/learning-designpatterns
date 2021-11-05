package com.nagarjuna.behavioral.templatemethod1;


public abstract class LoanCalculationAlgorithm {


    public int calculateLoan(){
        return (int) (getBaseAmount()*getInterest()-caclulateDiscount());
    }


    abstract int getBaseAmount();

    abstract double getInterest();

    abstract int caclulateDiscount();
}
