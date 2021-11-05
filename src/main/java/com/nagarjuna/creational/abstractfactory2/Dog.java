package com.nagarjuna.creational.abstractfactory2;

public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating, woof!");
    }
}
