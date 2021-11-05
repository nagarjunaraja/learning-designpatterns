package com.nagarjuna.behavioral.visitor1;


public abstract class CarPart {

    void acceptCarPartVisitor(CarPartVisitor visitor){
        visitor.visit(this);
    }

}
