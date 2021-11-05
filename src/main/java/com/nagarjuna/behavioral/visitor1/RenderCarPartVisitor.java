package com.nagarjuna.behavioral.visitor1;



public class RenderCarPartVisitor implements CarPartVisitor{

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Render "+carPart);
    }

}
