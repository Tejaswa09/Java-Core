package com.xworkz.polymorphism.material;

public class Metal extends Material {
    @Override
    public void type() {
        System.out.println("Type: Metal");
    }

    @Override
    public void hardness() {
        System.out.println("Hardness: High, depending on the metal type");
    }

    @Override
    public void use() {
        System.out.println("Use: Construction, manufacturing, electronics");
    }

    @Override
    public void durability() {
        System.out.println("Durability: Very durable, resistant to wear");
    }

    @Override
    public void price() {
        System.out.println("Price: Varies based on the type of metal");
    }
}
