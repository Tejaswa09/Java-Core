package com.xworkz.polymorphism.notification;

public class NotificationRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        PushNotification pushNotification = new PushNotification();
        pushNotification.type();
        pushNotification.deliveryMethod();
        pushNotification.urgency();
        pushNotification.sender();
        pushNotification.message();
        System.out.println();

        System.out.println("Parent Details:");
        Notification notification = new Notification();
        notification.type();
        notification.deliveryMethod();
        notification.urgency();
        notification.sender();
        notification.message();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Notification pushNotificationAsNotification = new PushNotification();
        pushNotificationAsNotification.type();
        pushNotificationAsNotification.deliveryMethod();
        pushNotificationAsNotification.urgency();
        pushNotificationAsNotification.sender();
        pushNotificationAsNotification.message();
    }
}
