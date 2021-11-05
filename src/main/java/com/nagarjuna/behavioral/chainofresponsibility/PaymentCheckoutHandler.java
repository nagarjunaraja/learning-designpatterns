package com.nagarjuna.behavioral.chainofresponsibility;

public class PaymentCheckoutHandler extends CheckoutHandler {

	@Override
	public void handleCheckout() {
		System.out.println("Handling Payment Checkout Handler implementation..");
		if(nextHandler != null) {
			nextHandler.handleCheckout();
		}
	}

}
