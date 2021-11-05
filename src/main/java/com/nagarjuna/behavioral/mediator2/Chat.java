package com.nagarjuna.behavioral.mediator2;

import java.util.Date;

public class Chat {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]: " + message);
    }
}
