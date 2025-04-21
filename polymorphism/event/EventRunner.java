package com.xworkz.polymorphism.event;

public class EventRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Seminar seminar = new Seminar();
        seminar.name();
        seminar.duration();
        seminar.location();
        seminar.participants();
        seminar.purpose();
        System.out.println();

        System.out.println("Parent Details:");
        Event event = new Event();
        event.name();
        event.duration();
        event.location();
        event.participants();
        event.purpose();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Event seminarAsEvent = new Seminar();
        seminarAsEvent.name();
        seminarAsEvent.duration();
        seminarAsEvent.location();
        seminarAsEvent.participants();
        seminarAsEvent.purpose();
    }
}
