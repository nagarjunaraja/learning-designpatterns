package com.nagarjuna.behavioral.strategy3;

public class App {

	public static void main(String[] args) {
		
		Context context = new Context(new Addition());
		System.out.println("Addition ... " + context.executeStrategy(10, 20));
		
		context = new Context(new Subtraction());
		System.out.println("Subtraction ... " + context.executeStrategy(20,10));
		
		context = new Context(new Multiplication());
		System.out.println("Multiplication ... " + context.executeStrategy(20, 20));
	}
}
