package com.nagarjuna.behavioral.strategy2;

public class FaceBookStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String name) {
		System.out.println(name + " Connected to Facebook");
		
	}

}
