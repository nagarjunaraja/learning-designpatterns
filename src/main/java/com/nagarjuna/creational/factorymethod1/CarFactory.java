package com.nagarjuna.creational.factorymethod1;

public class CarFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Car();
	}

}
