package com.xworkz.polymorphism.rose;

public class Rose extends Flower {
    @Override
    public void type() {
        System.out.println("Type: Rose (Flowering Plant)");
    }

    @Override
    public void color() {
        System.out.println("Color: Red, White, Yellow, Pink");
    }

    @Override
    public void fragrance() {
        System.out.println("Fragrance: Pleasant and aromatic");
    }

    @Override
    public void season() {
        System.out.println("Season: Primarily blooms in spring and summer");
    }

    @Override
    public void uses() {
        System.out.println("Uses: Symbol of love, used in perfumes, and decorative purposes");
    }
}
