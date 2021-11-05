package com.nagarjuna.principle.interface_segregation2;

public interface RestaurantInterface {
	public void acceptOnlineOrder();

	public void takeTelephoneOrder();

	public void payOnline();

	public void walkInCustomerOrder();

	public void payInPerson();
}
