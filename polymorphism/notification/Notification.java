package com.xworkz.polymorphism.notification;

public class Notification {
    public void type() {
        System.out.println("Type: Generic Notification");
    }

    public void deliveryMethod() {
        System.out.println("Delivery method: Various channels (Email, SMS, etc.)");
    }

    public void urgency() {
        System.out.println("Urgency: Depends on notification content");
    }

    public void sender() {
        System.out.println("Sender: Unknown or system-generated");
    }

    public void message() {
        System.out.println("Message: Default message content");
    }
}
