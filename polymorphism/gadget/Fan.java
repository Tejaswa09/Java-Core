package com.xworkz.polymorphism.gadget;

public class Fan extends Gadget {
    @Override
    public void name() {
        System.out.println("Name: Electric Fan");
    }

    @Override
    public void powerSource() {
        System.out.println("Power Source: Electricity");
    }

    @Override
    public void functionality() {
        System.out.println("Functionality: Circulates air to provide cooling");
    }

    @Override
    public void portability() {
        System.out.println("Portability: Available in both portable and fixed models");
    }

    @Override
    public void warrantyPeriod() {
        System.out.println("Warranty: 2 years");
    }
}
