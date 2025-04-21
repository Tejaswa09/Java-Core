package com.xworkz.polymorphism.book;

public class Novel extends Book {
    @Override
    public void title() {
        System.out.println("The Great Adventure");
    }


    public void author() {
        System.out.println("John Writer");
    }


    public void genre() {
        System.out.println("Adventure Fiction");
    }


    public void price() {
        System.out.println("Price: 350 INR");
    }


    public void pages() {
        System.out.println("Pages: 450");
    }
}
