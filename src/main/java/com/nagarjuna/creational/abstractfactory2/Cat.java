package com.nagarjuna.creational.abstractfactory2;

public class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat is eating, meow!");
    } 
}
