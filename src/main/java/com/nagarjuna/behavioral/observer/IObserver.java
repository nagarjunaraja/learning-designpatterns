package com.nagarjuna.behavioral.observer;

public interface IObserver {
	
	void callMe(Employee employee,String message);// When something changes in the subject it should call this method..

}
