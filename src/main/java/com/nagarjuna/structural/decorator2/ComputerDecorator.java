package com.nagarjuna.structural.decorator2;

public abstract class ComputerDecorator implements Computer {
    protected Computer computer;
    
    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void assemble() {
        this.computer.assemble();
    }
}
