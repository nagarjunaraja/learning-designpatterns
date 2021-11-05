package com.nagarjuna.behavioral.chainofresponsibility;

public class App {
	
	public static void main(String[] args) {
		
		PaymentCheckoutHandler paymentCheckoutHandler = new PaymentCheckoutHandler();
		CustomerCheckoutHandler customerCheckoutHandler = new CustomerCheckoutHandler();
		paymentCheckoutHandler.setNextHandler(customerCheckoutHandler);
		
		paymentCheckoutHandler.handleCheckout();
	}

}
