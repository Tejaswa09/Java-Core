package com.xworkz.polymorphism.tool;

public class Hammer extends Tool {
    @Override
    public void type() {
        System.out.println("Type: Hammer");
    }

    @Override
    public void material() {
        System.out.println("Material: Typically made from steel, wood, or fiberglass.");
    }

    @Override
    public void functionality() {
        System.out.println("Functionality: Used for driving nails, breaking objects, or shaping materials.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Commonly used in construction, carpentry, and metalworking.");
    }

    @Override
    public void weight() {
        System.out.println("Weight: Typically ranges from 0.5 to 2 kg depending on the type.");
    }
}
