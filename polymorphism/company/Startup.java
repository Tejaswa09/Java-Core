package com.xworkz.polymorphism.company;

public class Startup extends Company {
    @Override
    public void name() {
        System.out.println("Tech Innovators");
    }

    @Override
    public void industry() {
        System.out.println("Industry: Technology");
    }

    @Override
    public void employees() {
        System.out.println("Employees: 50-100");
    }

    @Override
    public void revenue() {
        System.out.println("Revenue: $1 million (early stage)");
    }

    @Override
    public void focusArea() {
        System.out.println("Focus Area: Product development and innovation");
    }
}
