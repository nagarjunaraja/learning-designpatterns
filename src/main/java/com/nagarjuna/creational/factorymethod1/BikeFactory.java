package com.nagarjuna.creational.factorymethod1;

public class BikeFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Bike();
	}

}
