package com.xworkz.polymorphism.message;

public class Message {
    public void type() {
        System.out.println("Type: Generic Message");
    }

    public void sender() {
        System.out.println("Sender: Unknown");
    }

    public void recipient() {
        System.out.println("Recipient: Unknown");
    }

    public void content() {
        System.out.println("Content: Plain text message");
    }

    public void sendTime() {
        System.out.println("Send time: Not specified");
    }
}
