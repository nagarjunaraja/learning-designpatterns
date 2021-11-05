package com.nagarjuna.principle.open_closed1;

public class Circle implements Shape {
	public double radius;

	public double calculateArea() {
		return (22 / 7) * radius * radius;
	}
}
