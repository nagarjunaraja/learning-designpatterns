package com.nagarjuna.structural.decorator1;

public class Client {

    public static void main(String[] args) {

        Window window = new Window();
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
        ScrollbarWindowDecorator scrollbarWindowDecorator = new ScrollbarWindowDecorator(iconWindowDecorator);

        scrollbarWindowDecorator.draw();



    }

}
