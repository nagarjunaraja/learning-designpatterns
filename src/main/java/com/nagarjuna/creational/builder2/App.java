package com.nagarjuna.creational.builder2;

public class App {
	
	public static void main(String[] args) {
		
		 Computer computer = new Computer.Builder()
	                .withCase("Tower")
	                .withCPU("Intel i5")
	                .withMotherboard("MSI B360M-MORTAR")
	                .withGPU("nVidia Geforce GTX 750ti")
	                .withHDD("Toshiba 1TB")
	                .withOperatingSystem("Windows 10")
	                .withPowerSupply(500)
	                .withAmountOfRam(8)
	                .build();
	 
	 //This is a much cleaner and more verbose way than writing:

	/*
	  Computer computer = new Computer("Tower", "Intel i5", "MSI B360M-MORTAR",
	 						"nVidia GeForce GTX 750ti, "Toshiba 1TB", "Windows 10", 500, 8);
	 */	
	}

}
