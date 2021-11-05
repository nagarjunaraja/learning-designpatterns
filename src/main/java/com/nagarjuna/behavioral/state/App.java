package com.nagarjuna.behavioral.state;

public class App {
	
	 public static void main(String[] args) throws Exception {
	        TCPConnection connection = new TCPConnection();

	        connection.open();

	        connection.acknowledge();
	        connection.close();

	        //connection.acknowledge();
	    }

}
