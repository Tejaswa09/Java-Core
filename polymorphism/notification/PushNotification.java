package com.xworkz.polymorphism.notification;

public class PushNotification extends Notification {
    @Override
    public void type() {
        System.out.println("Type: Push Notification");
    }

    @Override
    public void deliveryMethod() {
        System.out.println("Delivery method: Delivered through mobile apps or websites");
    }

    @Override
    public void urgency() {
        System.out.println("Urgency: Typically time-sensitive and instant");
    }

    @Override
    public void sender() {
        System.out.println("Sender: App or website user account");
    }

    @Override
    public void message() {
        System.out.println("Message: Custom message or alert");
    }
}
