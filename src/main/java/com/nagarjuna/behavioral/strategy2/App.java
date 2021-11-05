package com.nagarjuna.behavioral.strategy2;

public class App {
	
	public static void main(String[] args) {
		
		SocialMediaContext context = new SocialMediaContext(new FaceBookStrategy());
		context.connect("Nagarjuna");
		
		context = new SocialMediaContext(new TwitterStrategy());
		context.connect("Anjana");
	}

}
