package com.nagarjuna.structural.bridge2;

public class LinuxWindow extends WindowImpl {
	
	public void draw(int x, int y, int width , int height , String color) {
		System.out.println("Drawing Linux x: " + x + " y: " + " width: " + width + "height: " + height);
	}

	public void drawICON() {
		draw(0,0,10,10,"White");

		draw(0,0,10,10,"Black");
	}
}
