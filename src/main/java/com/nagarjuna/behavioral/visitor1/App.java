package com.nagarjuna.behavioral.visitor1;

public class App {

    public static void main(String[] args) {

        Car car = new Car();

        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());

        car.getCarParts().add(new Light());
        car.getCarParts().add(new Light());

        car.getCarParts().add(new Engine());


        car.upgrade();;
        car.print();
        car.render();
        
        
    }

}
