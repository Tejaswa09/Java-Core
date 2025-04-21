package com.xworkz.polymorphism.event;

public class Event {
    public void name() {
        System.out.println("Event: Generic Event");
    }

    public void duration() {
        System.out.println("Duration: Depends on event type");
    }

    public void location() {
        System.out.println("Location: May vary");
    }

    public void participants() {
        System.out.println("Participants: Open to public or private");
    }

    public void purpose() {
        System.out.println("Purpose: Entertainment, education, or networking");
    }
}
