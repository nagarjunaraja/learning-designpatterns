package com.nagarjuna.structural.adapter1;

public class App {

	public static void main(String [] args){
		App client = new App();

        LegacyRectangle legacyRectangle = new LegacyRectangle();

        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);

        client.calculateRectangleSize(adapter);

		
	}
	
	
	public void calculateRectangleSize(Rectangle rectangle){
		System.out.println("Rectangle Size: "+rectangle.determineSize());
	}
	
	
}

