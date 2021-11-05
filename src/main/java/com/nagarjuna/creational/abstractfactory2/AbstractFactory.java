package com.nagarjuna.creational.abstractfactory2;

public abstract class AbstractFactory {
	public abstract Pet getPet(String pet);

	public abstract Human getHuman(String human);
}
