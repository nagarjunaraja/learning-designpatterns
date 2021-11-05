package com.nagarjuna.creational.singleton;

//Intialization on Demand Holder using BILL PUE 
public class ConnectionBillPUGHSingleton {
	
	private ConnectionBillPUGHSingleton () {
		
	}
	
	private static class ConnectionHolder {
		private static final ConnectionBillPUGHSingleton CONNECTION = new ConnectionBillPUGHSingleton();
	}
	
	public static ConnectionBillPUGHSingleton getInstance() {
		return ConnectionHolder.CONNECTION;
	}

}
