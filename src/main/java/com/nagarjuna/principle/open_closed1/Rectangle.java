package com.nagarjuna.principle.open_closed1;

public class Rectangle implements Shape {
	double length;
	double width;

	public double calculateArea() {
		return length * width;
	}
}
