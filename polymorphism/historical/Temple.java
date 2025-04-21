package com.xworkz.polymorphism.historical;

public class Temple extends Historical {
    @Override
    public void name() {
        System.out.println("Name: Virupaksha Temple");
    }

    @Override
    public void location() {
        System.out.println("Location: Hampi, Karnataka");
    }

    @Override
    public void builtYear() {
        System.out.println("Built Year: 7th Century");
    }

    @Override
    public void importance() {
        System.out.println("Importance: Religious and architectural marvel");
    }

    @Override
    public void visitorCount() {
        System.out.println("Visitor Count: Thousands daily");
    }
}
