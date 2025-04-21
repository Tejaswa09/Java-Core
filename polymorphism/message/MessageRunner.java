package com.xworkz.polymorphism.message;

public class MessageRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Email email = new Email();
        email.type();
        email.sender();
        email.recipient();
        email.content();
        email.sendTime();
        System.out.println();

        System.out.println("Parent Details:");
        Message message = new Message();
        message.type();
        message.sender();
        message.recipient();
        message.content();
        message.sendTime();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Message emailAsMessage = new Email();
        emailAsMessage.type();
        emailAsMessage.sender();
        emailAsMessage.recipient();
        emailAsMessage.content();
        emailAsMessage.sendTime();
    }
}
