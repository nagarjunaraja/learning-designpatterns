package com.nagarjuna.structural.bridge2;

public class App {

	public static void main(String[] args) {
		
		IconWindow iconWindow = new IconWindow();
		iconWindow.setWindow(new MicrosoftWindow());
		iconWindow.drawICON();
		iconWindow.setWindow(new LinuxWindow());
		iconWindow.drawICON();
		
	}
}
