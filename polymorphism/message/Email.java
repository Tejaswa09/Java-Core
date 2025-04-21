package com.xworkz.polymorphism.message;

public class Email extends Message {
    @Override
    public void type() {
        System.out.println("Type: Email Message");
    }

    @Override
    public void sender() {
        System.out.println("Sender: Sender's email address");
    }

    @Override
    public void recipient() {
        System.out.println("Recipient: Recipient's email address");
    }

    @Override
    public void content() {
        System.out.println("Content: Includes subject, body text, attachments");
    }

    @Override
    public void sendTime() {
        System.out.println("Send time: Sent at the time of sending");
    }
}
