package com.xworkz.polymorphism.event;

public class Seminar extends Event {
    @Override
    public void name() {
        System.out.println("Event: Technical Seminar");
    }

    @Override
    public void duration() {
        System.out.println("Duration: 2 to 3 hours");
    }

    @Override
    public void location() {
        System.out.println("Location: Auditorium or seminar hall");
    }

    @Override
    public void participants() {
        System.out.println("Participants: Students, professionals, or researchers");
    }

    @Override
    public void purpose() {
        System.out.println("Purpose: Knowledge sharing and discussion");
    }
}
