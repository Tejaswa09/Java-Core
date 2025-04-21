package com.xworkz.polymorphism.gadget;

public class GadgetRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Fan fan = new Fan();
        fan.name();
        fan.powerSource();
        fan.functionality();
        fan.portability();
        fan.warrantyPeriod();
        System.out.println();

        System.out.println("Parent Details:");
        Gadget gadget = new Gadget();
        gadget.name();
        gadget.powerSource();
        gadget.functionality();
        gadget.portability();
        gadget.warrantyPeriod();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Gadget fanAsGadget = new Fan();
        fanAsGadget.name();
        fanAsGadget.powerSource();
        fanAsGadget.functionality();
        fanAsGadget.portability();
        fanAsGadget.warrantyPeriod();
    }
}
