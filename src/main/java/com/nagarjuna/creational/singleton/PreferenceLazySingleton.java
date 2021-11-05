package com.nagarjuna.creational.singleton;


//Singleton - Lazy Initialization
public class PreferenceLazySingleton {
	
	public static PreferenceLazySingleton INSTANCE = null;
	private static int counter;
	
	private PreferenceLazySingleton() {
		counter++;
	}

	public static synchronized PreferenceLazySingleton getInstance() {
		
		if(INSTANCE == null) {
			INSTANCE = new PreferenceLazySingleton();
		}
		
		return INSTANCE;
		
	}
	
	public int getCounter() {
		return counter;
	}
	
	public static void main(String[] args) {
		
		PreferenceLazySingleton preference = PreferenceLazySingleton.getInstance();
		System.out.println(preference.getCounter());
		
		 preference = PreferenceLazySingleton.getInstance();
		System.out.println(preference.getCounter());
		
	}
}
