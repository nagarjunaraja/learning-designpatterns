package com.nagarjuna.behavioral.strategy2;

public class SocialMediaContext {

	ISocialMediaStrategy iSocialMediaStrategy;
	
	public SocialMediaContext(ISocialMediaStrategy iSocialMediaStrategy) {
		this.iSocialMediaStrategy = iSocialMediaStrategy;
	}
	
	public void connect(String name) {
		iSocialMediaStrategy.connectTo(name);
	}
}
