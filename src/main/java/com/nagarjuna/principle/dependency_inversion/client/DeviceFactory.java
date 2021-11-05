package com.nagarjuna.principle.dependency_inversion.client;

import com.nagarjuna.principle.dependency_inversion.process.GeneralManufacturingProcess;
import com.nagarjuna.principle.dependency_inversion.process.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]){
		GeneralManufacturingProcess manfacturer = new SmartphoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();
	
	}
}
