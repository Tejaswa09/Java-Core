package com.xworkz.polymorphism.ball;

public class FootBall extends Ball {
    @Override
    public void type() {
        System.out.println("Type: Football");
    }

    @Override
    public void material() {
        System.out.println("Material: Leather or synthetic leather.");
    }

    @Override
    public void size() {
        System.out.println("Size: Standard size 5 for adults.");
    }

    @Override
    public void weight() {
        System.out.println("Weight: 410–450 grams.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used in the sport of football (soccer).");
    }
}
