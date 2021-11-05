package com.nagarjuna.creational.singleton;

public class StaticBlockIntializationSingleton {
	private static StaticBlockIntializationSingleton staticInstance;

	private StaticBlockIntializationSingleton() {
	}

	static {
		try {
			staticInstance = new StaticBlockIntializationSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception in static block");
		}
	}

	public static StaticBlockIntializationSingleton getInstance() {
		return staticInstance;
	}

}
