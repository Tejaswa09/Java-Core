package com.xworkz.polymorphism.publication;

public class Magazine extends Publication {
    @Override
    public void title() {
        System.out.println("Title: Popular Magazine");
    }

    @Override
    public void author() {
        System.out.println("Author: Various contributors");
    }

    @Override
    public void publishDate() {
        System.out.println("Publish Date: Monthly");
    }

    @Override
    public void genre() {
        System.out.println("Genre: Lifestyle, Fashion, News");
    }

    @Override
    public void language() {
        System.out.println("Language: English");
    }
}
