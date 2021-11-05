package com.nagarjuna.behavioral.visitor1;



public class PrintCarPartVisitor implements CarPartVisitor{

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Print "+carPart);
    }

}
