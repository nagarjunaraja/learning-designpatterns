package com.nagarjuna.creational.abstractfactory2;

public class Adult implements Human {
    @Override
    public void feedPet() {
        System.out.println("Adult is feeding pet responsibly.");
    }
}
