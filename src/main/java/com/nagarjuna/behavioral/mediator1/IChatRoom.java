package com.nagarjuna.behavioral.mediator1;

public interface IChatRoom 
{
    public void sendMessage(String msg, String userId);
 
    void addUser(User user);
}