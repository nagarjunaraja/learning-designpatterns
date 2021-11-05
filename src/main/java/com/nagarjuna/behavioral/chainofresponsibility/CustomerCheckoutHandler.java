package com.nagarjuna.behavioral.chainofresponsibility;

public class CustomerCheckoutHandler extends CheckoutHandler {

	@Override
	public void handleCheckout() {
		System.out.println("Handling Customer Checkout Handler Implementation...");
		if(nextHandler != null) {
			nextHandler.handleCheckout();
		}
	}

}
