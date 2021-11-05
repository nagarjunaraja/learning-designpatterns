package com.nagarjuna.creational.singleton;

//Eager Initialization
public class CountryEagerSingleton {
	
	private static final CountryEagerSingleton CON_COUNTRY = new CountryEagerSingleton();
	
	private CountryEagerSingleton() {
		
	}
	
	public static CountryEagerSingleton getInstance() {
		return CON_COUNTRY;
	}

}
