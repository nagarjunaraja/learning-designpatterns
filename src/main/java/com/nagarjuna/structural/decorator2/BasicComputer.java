package com.nagarjuna.structural.decorator2;

public class BasicComputer implements Computer {
    @Override
    public void assemble() {
        System.out.print("Assembling a basic computer.");
    }
}
