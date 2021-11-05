package com.nagarjuna.creational.factorymethod1;

public class App {

	public static void main(String[] args) {
		
		TransportFactory transportFactory = new BikeFactory();
		System.out.println(transportFactory.create());
		
		transportFactory = new CarFactory();
		System.out.println(transportFactory.create());
	}
}
