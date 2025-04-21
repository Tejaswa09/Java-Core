package com.xworkz.polymorphism.bottle;


public class Bottle extends Plastic {
    @Override
    public void type() {
        System.out.println("PET Plastic");
    }

    @Override
    public void usage() {
        System.out.println("Used to store water and beverages");
    }

    @Override
    public void recyclable() {
        System.out.println("Yes, it's recyclable");
    }

    @Override
    public void meltingPoint() {
        System.out.println("Around 260°C");
    }

    @Override
    public void color() {
        System.out.println("Usually clear or colored");
    }
}
