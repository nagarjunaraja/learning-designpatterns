package com.nagarjuna.creational.abstractfactory2;

public class Child implements Human {
    @Override
    public void feedPet() {
        System.out.println("Child is feeding pet irresponsibly.");
    }
}
