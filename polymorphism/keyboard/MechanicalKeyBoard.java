package com.xworkz.polymorphism.keyboard;

public class MechanicalKeyBoard extends KeyBoard {
    @Override
    public void type() {
        System.out.println("Type: Mechanical Keyboard");
    }

    @Override
    public void connection() {
        System.out.println("Connection: Wired, USB Type-C");
    }

    @Override
    public void keys() {
        System.out.println("Keys: Mechanical switches (e.g., Cherry MX, Gateron)");
    }

    @Override
    public void price() {
        System.out.println("Price: Higher due to mechanical switches");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Typing, gaming, and programming");
    }
}
